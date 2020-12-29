package ru.job4j.sintax.array;

public class SkipNegative {
    /**
     * Заменяем все отрицательные значения в массиве на ноль
     * @param array
     * @return
     */
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}
