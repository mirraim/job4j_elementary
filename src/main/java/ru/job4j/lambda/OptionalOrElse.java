package ru.job4j.lambda;

import java.util.Optional;

public class OptionalOrElse {
    public static Integer orElse(Optional<Integer> optional) {
//        Integer value = -1;
//        if (optional.isPresent()) {
//            value = optional.get();
//        }
        return optional.orElse(-1);
    }
}
