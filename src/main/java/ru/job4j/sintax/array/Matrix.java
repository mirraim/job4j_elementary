package ru.job4j.sintax.array;

public class Matrix {
    /**
     * Перемножаем индексы двумерного массива
     * @param size
     * @return
     */
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                array[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return array;
    }
}
