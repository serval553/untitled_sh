package com.company;
import Service.Create;
import Service.Delete;
import Service.Read;
import Service.Update;
import java.sql.SQLException;


public class Main {


    public static void main(String[] args) throws SQLException {

        Create c = new Create();
        c.student(1, "Ivan", 5);

        Delete d = new Delete();
        d.student(1);

        Read r = new Read();
        r.subject();

        Update u = new Update();
        u.student(1, 1, "lesha", 6);
    }
}
