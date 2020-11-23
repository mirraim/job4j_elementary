package ru.job4j.oop.profession;

public class Engineer extends Profession {
    private boolean hasBeard;
    private Project project;

    public boolean isHasBeard() {
        return hasBeard;
    }

    public Project getProject() {
        return project;
    }
}
