package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        double man = Fit.manWeight(manHeight);
        short womanHeight = 164;
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 164 is " + woman);
    }
}
