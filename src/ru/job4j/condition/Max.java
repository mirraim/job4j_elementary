package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int temp = max(second, third);
        return first > temp ? first : temp;
    }

    public static int max(int first, int second, int third, int fourth) {
        int temp = max(second, third, fourth);
        return first > temp ? first : temp;
    }
}
