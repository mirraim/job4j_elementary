package ru.job4j.sintax.array;

public class SwitchArray {
    /**
     * Меняем две ячейки массива местами
     * @param array
     * @param source
     * @param dest
     * @return
     */
    public static int[] swap(int[] array, int source, int dest) {
            int temp = array[source];
            array[source] = array[dest];
            array[dest] = temp;
        return array;
    }

    /**
     * меняем местами первую и последнюю ячейки массива
     * @param array
     * @return
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i = 0; i < rsl.length; i++) {
            int index = rsl.length - 1 - i;
            if (index % 2 == 0) {
                System.out.println("index = " + index + ", value = " + rsl[index]);
            }
        }
    }
}
