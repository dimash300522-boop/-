package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/shop_db";
        String user = "postgres";
        String password = "EXILE257";

        System.out.println("Connecting to database...");

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("---------------------------------------");
                System.out.println("SUCCESS! Connected to the database.");
                System.out.println("---------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("---------------------------------------");
            System.out.println("FAILED to connect!");
            System.out.println("Error message: " + e.getMessage());

            // Қателерді талдау:
            if (e.getMessage().contains("password authentication failed")) {
                System.out.println("Кеңес: Пароль қате жазылған!");
            } else if (e.getMessage().contains("does not exist")) {
                System.out.println("Кеңес: База аты (shop) қате немесе құрылмаған!");
            } else if (e.getMessage().contains("No suitable driver")) {
                System.out.println("Кеңес: JDBC Driver (JAR файл) қосылмаған!");
            }
            System.out.println("---------------------------------------");
        }
    }
}