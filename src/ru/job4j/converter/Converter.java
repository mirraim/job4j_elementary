package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = out == expected;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 120;
        out = Converter.rubleToDollar(in);
        passed = out == expected;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
    }
}
