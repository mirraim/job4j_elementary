package ru.job4j.oop.profession;

import java.util.Date;

public class Builder extends Engineer {
    private Building building;

    public Builder(String name, String surname, String education, Date birthday,
                   boolean hasBeard, Project project, Building building) {
        super(name, surname, education, birthday, hasBeard, project);
        this.building = building;
    }

    public Building getBuilding() {
        return building;
    }

    public void build(Project project, Building building) {
    }
}
