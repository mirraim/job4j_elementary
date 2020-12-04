package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Еду по рельсам. Чух, чух, ту-ту!");
    }

    @Override
    public int speed() {
        return 55;
    }
}
