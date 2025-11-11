package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnector {
    public static Connection connect() {
        String url = "jdbc:postgresql://localhost:5432/your_database";
        String user = "postgresql";
        String password = "12345";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to PostgreSQL!");
            return conn;
        } catch (SQLException e) {
            System.out.println("❌ Connection failed: " + e.getMessage());
            return null;
        }
    }
}