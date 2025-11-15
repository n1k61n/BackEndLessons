package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WeatherScraperHtml {
     static void main(String[] args) {
        try {
            String url = "https://yandex.com.tr/hava/en/baku/month";

            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0")
                    .get();

            // All days
            Elements days = doc.select(".climate-calendar-day");

            for (Element day : days) {
                String date = day.select(".climate-calendar-day__date").text();
                String temp = day.select(".temp__value").text();

                if (!date.isEmpty() && !temp.isEmpty()) {
                    System.out.println(date + " → " + temp + "°C");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
