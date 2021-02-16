package ru.job4j.sintax.array;

import java.util.Arrays;

public class Machine {
    private static final int[] COINS = {10, 5, 2, 1};

    /**
     * Жадный алгоритм. Записываем в массив набор монет
     * @param money
     * @param price
     * @return
     */
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
        return Arrays.copyOf(rsl, size);
    }
}
