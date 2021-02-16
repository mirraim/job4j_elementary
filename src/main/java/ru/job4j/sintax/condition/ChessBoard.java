package ru.job4j.sintax.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int deltaX = Math.abs(x2 - x1);
        int deltaY = Math.abs(y2 - y1);
        return deltaX == deltaY ? deltaX : 0;
    }
}
