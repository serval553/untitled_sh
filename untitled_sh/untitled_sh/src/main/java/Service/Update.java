package Service;

import model.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

    private Connection conn = MyConnection.create_conn();

    public void student(int id_student, int id_subject, String name, int group) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("UPDATE student  SET (id_subject, name, grypa) " +
                "= (" + id_subject + ", '"+ name +"', " + group + ") WHERE id = " + id_student + ";");
        System.out.println("Updated");
    }

    public void schedule(int id_schedule, int id_student, int id_task, String day) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("UPDATE schedule  SET (id_student, id_task, day) " +
                "= ("+ id_student + ", " + id_task + ",  '"+ day +"') WHERE id = " + id_schedule + ";");
    }

    public void  subject(int id_subject, String name) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("UPDATE subject SET (name) = ('"+ name +"') WHERE id = " + id_subject +";");
    }

    public void  tasks(int id_task, int id_student, int id_subject, String name) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("UPDATE task  SET (id_student, id_subject, name) " +
                "= ("+ id_student +", "+ id_subject + ", '"+ name +"') WHERE id = "+ id_task +";");
    }
}
