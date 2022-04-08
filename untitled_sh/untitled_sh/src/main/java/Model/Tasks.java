package model;


public class Tasks {

    int id;
    int id_user;
    int id_subject;
    String name;

    public Tasks(int id, int id_user, int id_subject, String name) {
        this.id = id;
        this.id_user = id_user;
        this.id_subject = id_subject;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_subject() {
        return id_subject;
    }

    public void setId_subject(int id_subject) {
        this.id_subject = id_subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

