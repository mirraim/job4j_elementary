package ru.job4j.oop.pojo;

import java.time.LocalDate;

public class College {

    public static void main(String[] args) {
        Student petrov = new Student();
        petrov.setFullName("Петров Александр Петрович");
        petrov.setGroup(3);
        petrov.setDate(LocalDate.of(2020, 8, 25));
        System.out.println("fullName='" + petrov.getFullName() + '\''
                + ", group=" + petrov.getGroup()
                + ", date=" + petrov.getDate());
    }
}
