package model;

public class Lesson {

    int id_subject;
    int id_user;

    public Lesson(int id_subject, int id_user) {
        this.id_subject = id_subject;
        this.id_user = id_user;
    }

    public int getId_subject() {
        return id_subject;
    }

    public void setId_subject(int id_subject) {
        this.id_subject = id_subject;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}