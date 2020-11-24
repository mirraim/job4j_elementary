package ru.job4j.oop.profession;

import java.util.Date;

public class Engineer extends Profession {
    private boolean hasBeard;
    private Project project;

    public Engineer(String name, String surname, String education, Date birthday,
                    boolean hasBeard, Project project) {
        super(name, surname, education, birthday);
        this.hasBeard = hasBeard;
        this.project = project;
    }

    public boolean isHasBeard() {
        return hasBeard;
    }

    public Project getProject() {
        return project;
    }
}
