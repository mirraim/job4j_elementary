package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        return fillMap(left).equals(fillMap(right));
    }

    public static Map<String, Integer> fillMap(String word) {
        Map<String, Integer> rsl = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String symbol = String.valueOf(word.charAt(i));
            int quantity = 1;
            if (rsl.containsKey(symbol)) {
                quantity = rsl.get(symbol) + 1;
            }
            rsl.put(symbol, quantity);
        }
        return rsl;
    }
}
