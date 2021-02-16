package ru.job4j.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorClass {

    /**
     * Редукция - сведение результата к чему-то одному.
     * В данном случае - к коллекции LinkedList
     * @param list список
     * @return сведенный список
     */
    public static List<Integer> collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> biConsumer = List::add;
        BinaryOperator<List<Integer>> operator = (left, right) -> {
            left.addAll(right);
            return left;
        };
        return list.stream().collect(Collector.of(supplier, biConsumer, operator));
    }

    public static Integer reduce(List<Integer> list) {
        return list.stream().reduce(5, (n1, n2) -> n1 * n2);
    }
}
