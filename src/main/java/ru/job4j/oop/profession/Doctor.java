package ru.job4j.oop.profession;

import java.util.Date;

public class Doctor extends Profession {
    private boolean uniform;
    private Pacient pacient;

    public Doctor(String name, String surname, String education, Date birthday, boolean uniform, Pacient pacient) {
        super(name, surname, education, birthday);
        this.uniform = uniform;
        this.pacient = pacient;
    }

    public void treat(Pacient pacient) {
    }

    public boolean hasUniform() {
        return uniform;
    }
}
