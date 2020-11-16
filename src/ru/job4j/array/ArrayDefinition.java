package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        createShort(10);
        createString(100500);
        createFloat(40);
        String[] names = fillStringArray(4);
        printArray(names);

    }

    public static short[] createShort(int size) {
        short[] ages = new short[size];
        System.out.println("Размер массива ages равен: " + ages.length);
        return ages;
    }

    public static String[] createString(int size) {
        String[] surnames = new String[size];
        System.out.println("Размер массива surnames равен: " + surnames.length);
        return surnames;
    }

    public static float[] createFloat(int size) {
        float[] prices = new float[size];
        System.out.println("Размер массива prices равен: " + prices.length);
        return prices;
    }

    public static String[] fillStringArray(int size) {
        String[] names = new String[size];
        names[0] = "Ann";
        names[1] = "John";
        names[2] = "Bill";
        names[3] = "Kate";
        return names;
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }
}
