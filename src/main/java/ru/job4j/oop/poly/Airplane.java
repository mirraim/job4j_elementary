package ru.job4j.oop.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Лечуууууу!");
    }

    @Override
    public int speed() {
        return 850;
    }
}
