package Service;

import model.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

    private Connection conn = MyConnection.create_conn();

    public void student(int id_subject, String name, int group) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("INSERT INTO student (id_subject, name, grypa) " +
                "VALUES (" + id_subject + ", '"+ name +"', " + group + ");");
    }

    public void schedule(int id_student, int id_task, String day) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("INSERT INTO schedule (id_student, id_task, day) " +
                "VALUES ("+ id_student + ", " + id_task + ",  '"+ day +"');");
    }

    public void  subject(String name) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("INSERT INTO subject (name) VALUES ('"+ name +"');");
    }

    public void  tasks(int id_student, int id_subject, String name) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("INSERT INTO task (id_student, id_subject, name) " +
                "VALUES ("+ id_student +", "+ id_subject + ", '"+ name +"');");
    }

}
