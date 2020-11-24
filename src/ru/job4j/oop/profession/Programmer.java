package ru.job4j.oop.profession;

import java.util.Date;

public class Programmer extends Engineer {
    public String level;

    public Programmer(String name, String surname, String education, Date birthday,
                      boolean hasBeard, Project project, String level) {

        super(name, surname, education, birthday, hasBeard, project);
        this.level = level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void code(Project project) {

    }
}
