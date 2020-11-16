package ru.job4j.array;

public class FindLoop {
    /**
     * Ищем индекс элемента. Если элемента нет в массиве, то возвращаем -1.
     * @param data
     * @param el
     * @return
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Ищем индекс элемента в фрагменте массива. Если элемента нет в массиве, то возвращаем -1.
     * @param data
     * @param el
     * @return
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
