package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeatherScraperHtml {


    static void main(String[] args) throws SQLException, IOException {
        test();
    }

    static void test() throws SQLException, IOException {
        // 1. Connect to PostgreSQL
        String urlDb = "jdbc:postgresql://localhost:5432/weatherdb";
        String user = "postgres";
        String password = "12345";
        Connection conn = DriverManager.getConnection(urlDb, user, password);

        // 2. Fetch the weather page
        String url = "https://yandex.com.tr/hava/en/baku/month?lat=40.372973&lon=49.853145";
        Document doc = Jsoup.connect(url).get();

        // 3. Select calendar <ul> elements
        Elements calendars = doc.select("ul.AppMonthCalendar_calendar__tXeHf");

        // 4. Prepare SQL insert
        String sql = "INSERT INTO day_weather (day_number, month, day_temp, night_temp) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        // 5. Loop through days
        for (Element calendar : calendars) {
            Elements days = calendar.select("li");
            for (Element day : days) {

                Pattern p = Pattern.compile("(\\d+)\\s+(\\w+)\\s+([+-]?\\d+°)\\s+([+-]?\\d+°)");
                Matcher m = p.matcher(day.text());
                if (m.find()) {
                    int dayNumber = Integer.parseInt(m.group(1));
                    String month = m.group(2);
                    String dayTemp = m.group(3);
                    String nightTemp = m.group(4);
                    // save to DB
                    stmt.setInt(1, dayNumber);
                    stmt.setString(2, month);
                    stmt.setString(3, dayTemp);
                    stmt.setString(4, nightTemp);
                    stmt.executeUpdate();
                }
            }
        }

        // 6. Close connection
        stmt.close();
        conn.close();
        System.out.println("Weather data saved to PostgreSQL!");
    }

}
