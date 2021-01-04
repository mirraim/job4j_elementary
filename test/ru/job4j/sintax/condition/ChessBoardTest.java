package ru.job4j.sintax.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ChessBoardTest {
    @Test
    public void wayIs5() {
        int way = ChessBoard.way(6, 7, 1, 2);
        assertThat(way, is(5));
    }

    @Test
    public void wayIs7() {
        int way = ChessBoard.way(7, 0, 0, 7);
        assertThat(way, is(7));
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(2, 6, 4, 1);
        assertThat(way, is(0));
    }
}