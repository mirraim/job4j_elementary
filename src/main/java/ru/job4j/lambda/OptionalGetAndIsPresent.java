package ru.job4j.lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        if (indexOf(data, el).isPresent()) {
            return indexOf(data, el).get();
        }
        return -1;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> rsl = Optional.empty();
        for (int i = 0; i < data.length; i++) {
           if (data[i] == el) {
               rsl = Optional.of(i);
           }
        }
        return  rsl;
    }
}
