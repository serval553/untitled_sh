package Service;

import model.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

    private Connection conn = MyConnection.create_conn();

    public void student(int id_student) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("DELETE FROM schedule WHERE id_student = "+ id_student +";");
        statement.executeUpdate("DELETE FROM task WHERE id_student = "+ id_student +";");
        statement.executeUpdate("DELETE FROM student WHERE id = "+ id_student +";");
    }

    public void schedule(int id_student, int id_task) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("DELETE FROM schedule WHERE id_student = " + id_student + " " +
                "AND id_task = " + id_task+");");
    }

    public void subject(int id_subject) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("DELETE FROM subject WHERE id = "+ id_subject +";");
    }

    public void task(int id_task) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate("DELETE FROM schedule WHERE id_task = "+ id_task +";");
        statement.executeUpdate("DELETE FROM task WHERE id = "+ id_task +";");
    }

}
