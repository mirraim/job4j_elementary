package ru.job4j.sintax.array;

public class EndsWith {
    /**
     * Проверяем. что массив word имеет последние элементы одинаковые с post
     * @param word
     * @param post
     * @return
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - 1 - i] != word[word.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
