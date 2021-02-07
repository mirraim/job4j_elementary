package ru.job4j.lambda;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> rsl = Optional.empty();
        for (String line : strings) {
            if (Objects.equals(line, value)) {
                rsl = Optional.ofNullable(line);
            }
        }
        return rsl;
    }
}
