package model;

import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {

    static private final String DB_URL = ("jdbc:postgresql://127.0.0.1:5432/ToDoList");
    static private  final String USER = "postgres";
    static private final String PASS = "root";

    public static java.sql.Connection create_conn() {
        System.out.println("Testing connection to PostgreSQL JDBC");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return null;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        java.sql.Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (
                SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return null;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }
        return connection;
    }
}
