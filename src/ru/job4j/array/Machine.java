package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private static final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int remain = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (remain - COINS[i] >= 0) {
                rsl[size] = COINS[i];
                remain -= COINS[i];
                size++;
            }
        }
        /*while (remain > 0) {
            for (int i = 0; i < COINS.length; i++) {
                if (remain >= COINS[i]) {
                    rsl[size] = COINS[i];
                    remain -= COINS[i];
                    break;
                }
            }
            size++;
        }*/
        return Arrays.copyOf(rsl, size);
    }
}
