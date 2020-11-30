package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int countMatches = 11;
        int countIter = 0;
        String[] player = {"player1", "player2"};
        Scanner input = new Scanner(System.in);

        while (countMatches > 0) {
            System.out.println(player[countIter % 2] + " делает ход");
            int desicion = Integer.valueOf(input.nextLine());
            if (desicion > 0 && desicion < 4) {
                countMatches -= desicion;
                System.out.println("Осталось " + countMatches + " спичек");
                if (countMatches <= 0) {
                    System.out.println(player[countIter % 2] + " выиграл!");
                }
                countIter++;
            }

        }
    }
}
