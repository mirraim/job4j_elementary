package ru.job4j.lambda;

import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        max(data).ifPresent((s) -> System.out.println("Max: " + s));
    }

    private static Optional<Integer> max(int[] data) {
        Optional<Integer> rsl = Optional.empty();
        if (data.length > 0) {
            int max = data[0];
            for (int j = 0; j < data.length; j++) {
                max = Math.max(max, data[j]);
            }
            rsl = Optional.of(max);
        }
        return rsl;
    }
}
