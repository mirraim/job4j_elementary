package ru.job4j.oop.profession;

public class Doctor extends Profession {
    private boolean uniform;
    private Pacient pacient;

    public void treat(Pacient pacient) {
    }

    public boolean hasUniform() {
        return uniform;
    }
}
