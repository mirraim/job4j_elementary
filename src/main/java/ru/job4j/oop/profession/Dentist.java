package ru.job4j.oop.profession;

import java.util.Date;

public class Dentist extends Doctor {

    public Dentist(String name, String surname, String education, Date birthday,
                   boolean uniform, Pacient pacient) {
        super(name, surname, education, birthday, uniform, pacient);
    }

    public void treatTeeth(Pacient pacient) {

    }
}
