package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book karlson = new Book("Карлсон, который живет на крыше", 189);
        Book shining = new Book("The Shining", 544);
        Book cleanCode = new Book("Clean Code", 464);
        Book thrones = new Book("A Game of Thrones", 768);

        Book[] books = new Book[4];
        books[0] = karlson;
        books[1] = shining;
        books[2] = cleanCode;
        books[3] = thrones;

        printAll(books);
        System.out.println();
        change(books, 0, 3);
        printAll(books);
        System.out.println();
        printIf(books, "Clean Code");
    }

    public static void printAll(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + ", " + books[i].getPages());
        }
    }

    public static void change(Book[] books, int first, int second) {
        Book temp = books[first];
        books[first] = books[second];
        books[second] = temp;
    }

    public static void printIf(Book[] books, String name) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) {
                System.out.println(books[i].getName() + ", " + books[i].getPages());
            }
        }
    }
}
