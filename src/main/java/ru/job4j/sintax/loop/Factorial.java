package ru.job4j.sintax.loop;

public class Factorial {

    public static int calc(int n) {
        int result = 1;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                result = result * i;
            }
        }
        return result;
    }
}
