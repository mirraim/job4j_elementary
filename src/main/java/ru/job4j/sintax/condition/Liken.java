package ru.job4j.sintax.condition;

public class Liken {

    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        System.out.println(isMore(first, second));
        System.out.println(isLess(first, second));
        System.out.println(isEquals(first, second));
    }

    public static boolean isMore(int first, int second) {
        return first > second;
    }

    public static boolean isLess(int first, int second) {
        return first < second;
    }

    public static boolean isEquals(int first, int second) {
        return first == second;
    }
}
