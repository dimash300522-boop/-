package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/shop";
    private static final String USER = "postgres";
    private static final String PASSWORD = "YOUR_PASSWORD"; // Осы жерге пароль жазыңыз

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            return null;
        }
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
}