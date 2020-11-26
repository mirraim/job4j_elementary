package ru.job4j.pojo;

import java.time.LocalDate;

public class College {

    public static void main(String[] args) {
        Student petrov = new Student();
        petrov.setFullName("Петров Александр Петрович");
        petrov.setGroup(3);
        petrov.setDate(LocalDate.of(2020, 8, 25));
        System.out.println(petrov.toString());
    }
}
