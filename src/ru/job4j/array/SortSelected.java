package ru.job4j.array;

public class SortSelected {

    /**
     * Сортировка выбором (по возрастанию)
     * @param data
     * @return
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = Min.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            data[index] = data[i];
            data[i] = min;
        }
        return data;
    }
}
