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

            if (e.getMessage().contains("password authentication failed")) {
                System.out.println("Incorrect Password");
            } else if (e.getMessage().contains("does not exist")) {
                System.out.println("Tip: The database name (store) is incorrect or not created!");
            } else if (e.getMessage().contains("No suitable driver")) {
                System.out.println("Tip: JDBC Driver (JAR file) is not included!");
            }
            System.out.println("---------------------------------------");
        }
    }
}
