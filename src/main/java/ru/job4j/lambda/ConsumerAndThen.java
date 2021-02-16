package ru.job4j.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = s -> System.out.print(input);
        Consumer<String> ln = s -> System.out.println();
        return print.andThen(ln);
    }

    public static Supplier<String> supplier() {
        return () -> "";
    }

    public static Function<Double, Double> apply() {
        return Math::sqrt;
    }

    public static Predicate<String> predicate() {
        return String::isEmpty;
    }

    public void applyByInstance() {
        Consumer<String> consumer = this::consumerByInstance;
        consumer.accept("Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumer = ConsumerAndThen::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }
}
