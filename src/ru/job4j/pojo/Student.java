package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fullName;
    private int group;
    private LocalDate date;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{"
                + "fullName='" + fullName + '\''
                + ", group=" + group
                + ", date=" + date
                + '}';
    }
}
