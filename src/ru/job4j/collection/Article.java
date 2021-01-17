package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        Set<String> originWords = new HashSet<>(Arrays.asList(origin.split("\\s*(\\s|,|!|\\.)\\s*")));

        for (String word : line.split("\\s*(\\s|,|!|\\.)\\s*")) {
            if (!originWords.contains(word)) {
                return false;
            }
        }
        return true;
    }
}
