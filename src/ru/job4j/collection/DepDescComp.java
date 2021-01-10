package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int size = Math.min(o1.length(), o2.length());
        int start = 0;
        while (o1.charAt(start) != '/') {
            if (o1.charAt(start) != o2.charAt(start)) {
                return Integer.compare(o2.charAt(start), o1.charAt(start));
            }
            start++;
            if (start == size) {
                break;
            }
        }
        for (int i = start; i < size; i++) {
            if (o1.charAt(i) != o2.charAt(i)) {
                return Integer.compare(o1.charAt(i), o2.charAt(i));
            }
        }
        return Integer.compare(o1.length(), o2.length());
    }
}
