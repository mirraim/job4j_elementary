package ru.job4j.sintax.array;

public class Square {
    /**
     * заполнить массив через цикл элементами от 0 до bound , возведенными в квадрат
     * @param bound
     * @return
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }

}
