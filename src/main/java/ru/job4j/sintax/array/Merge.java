package ru.job4j.sintax.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (leftIndex == left.length) {
                rsl[i] = right[rightIndex];
                rightIndex++;
            } else if (rightIndex == right.length) {
                rsl[i] = left[leftIndex];
                leftIndex++;
            } else {
                if (left[leftIndex] < right[rightIndex]) {
                    rsl[i] = left[leftIndex];
                    leftIndex++;
                } else {
                    rsl[i] = right[rightIndex];
                    rightIndex++;
                }
            }
        }
        return rsl;
    }
}
