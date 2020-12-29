package ru.job4j.sintax.array;

public class MatrixCheck {
    /**
     * Проверяем, вся ли горизонталь заполнена символом 'X'
     * @param board
     * @param row
     * @return
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверяем, вся ли вертикаль заполнена символом 'X'
     * @param board
     * @param column
     * @return
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Извлекаем значения из диагонали и записываем в результирующий массив
     * @param board
     * @return
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Проверяем наличие вертикальных или горизонтальных линий
     * @param board
     * @return
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int index = -1;
        for (int i = 0; i < board.length; i++) {
           if (board[i][i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
