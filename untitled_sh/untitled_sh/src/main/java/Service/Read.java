package Service;

import model.MyConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

    private Connection conn = MyConnection.create_conn();

    public void student() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM student;");

        int count = 0;

        while (result.next()) {
            String id = result.getString(1);
            String id_subject = result.getString(2);
            String name = result.getString(3);
            String group = result.getString(4);

            String output = "Student #%d: %s - %s - %s - %s";
            System.out.println(String.format(output, ++count, id, id_subject, name, group));
        }
    }

    public void schedule() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM schedule;");
        int count = 0;

        while (result.next()) {
            String id = result.getString(1);
            String id_student = result.getString(2);
            String id_task = result.getString(3);
            String day = result.getString(4);

            String output = "Schedule #%d: %s - %s - %s - %s";
            System.out.println(String.format(output, ++count, id, id_student, id_task, day));
        }
    }

    public void subject() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM subject;");

        int count = 0;

        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);

            String output = "Subject #%d: %s - %s";
            System.out.println(String.format(output, ++count, id, name));
        }
    }

    public void task() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM task;");

        int count = 0;

        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            String id_student = result.getString(3);
            String id_subject = result.getString(4);

            String output = "Task #%d: %s - %s - %s - %s";
            System.out.println(String.format(output, ++count, id, name, id_student, id_subject));
        }

    }
}

