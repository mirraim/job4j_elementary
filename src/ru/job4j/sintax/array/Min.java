package ru.job4j.sintax.array;

public class Min {

    /**
     * проверить, что эталон больше, чем элемент. записать в эталон элемент массива
     * @param array
     * @return
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }

    /**
     * проверить, что эталон больше, чем элемент фрагмента массива. записать в эталон элемент массива.
     * @param array
     * @param start
     * @param finish
     * @return
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start + 1; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
