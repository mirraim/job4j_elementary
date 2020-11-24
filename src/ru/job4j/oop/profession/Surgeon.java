package ru.job4j.oop.profession;

import java.util.Date;

public class Surgeon extends Doctor {

    public Surgeon(String name, String surname, String education, Date birthday,
                   boolean uniform, Pacient pacient) {
        super(name, surname, education, birthday, uniform, pacient);
    }

    public void operate(Pacient pacient) {
    }
}
