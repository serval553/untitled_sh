package DataBase;
/*
CREATE TABLE Student
        (
        id SERIAL PRIMARY KEY,
        id_subject INTEGER,
        name TEXT,
        group INTEGER
        );

CREATE TABLE Subject
    (
    id SERIAL PRIMARY KEY,
    name TEXT
    );

CREATE TABLE Task
    (
    id SERIAL PRIMARY KEY,
    name TEXT,
    id_student integer REFERENCES Student ON DELETE CASCADE,
    id_subject integer REFERENCES Subject ON DELETE CASCADE
    );

CREATE TABLE Schedule
    (
    id_student integer REFERENCES Student ON DELETE CASCADE,
    id_task integer REFERENCES Task ON DELETE CASCADE,
    day TEXT
    );
 */