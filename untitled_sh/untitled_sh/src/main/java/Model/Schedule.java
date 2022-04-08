package model;

import model.Subject;

import java.util.*;


public class Schedule {

    int id_student;
    int id_task;
    String day;
    private Map<Integer, List<Subject>> subjects = new HashMap<>();

    public Schedule() {
        subjects.put(1, Arrays.asList(new Subject("Методы оптимизации"), new Subject("Электродинамика")));
        subjects.put(2, Arrays.asList(new Subject("Теория информации"), new Subject("Электротехника")));
        subjects.put(3, Arrays.asList(new Subject("Операционные системы"), new Subject("Язык программирования Java")));
        subjects.put(4, Arrays.asList(new Subject("Информационные технологии"), new Subject("Криптография")));
        subjects.put(5, Arrays.asList(new Subject("Правоведене"), new Subject("ТИПиС")));
        subjects.put(6, Arrays.asList(new Subject("Электодинамика"), new Subject("Криптография")));
    }


    public void delete_subject(int data, String subject) {
        subjects.get(data).remove(new Subject(subject));
    }

    public void add_subject(int data, String name) {//заменить на новый список по тому же ключу
        List copy = new ArrayList<>(subjects.get(data));
        copy.add(new Subject(name));
        subjects.put(data,copy);
    }

    public void change_the_name(int data, String subject_for_delete, String subject_for_replacement) {
        delete_subject(data, subject_for_delete);
        subjects.get(data).add(data,new Subject(subject_for_replacement));

    }

//     int day_of_week(int day, int month) {//throws
//        int box;
//        if (month <= 12 && month >= 1) {
//            box = switch (month) {
//                case 1, 10 -> 1;
//                case 5 -> 2;
//                case 8 -> 3;
//                case 2, 3, 11 -> 4;
//                case 6 -> 5;
//                case 12, 9 -> 6;
//                case 4, 7 -> 0;
//                default -> 0; ;
//            };
//        } else {
//            box = 0;
//            System.out.println("Неккоректно введен месяц. Пожалуйста, введите номер месяца цифрами от 1 до 12 ");
//        }
//        return (day + box + 4) % 7;
//
//    }

    @Override
    public String toString() {
        return "Предмет" +
                subjects +
                "добавлен";
    }
}