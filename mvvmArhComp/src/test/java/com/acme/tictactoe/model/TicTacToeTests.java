package com.acme.tictactoe.model;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class TicTacToeTests {

    private Table board;

    @Before
    public void setup() {
        board = new Table();
    }

    @Test
    public void when3inRowAcrossTopForX_xShouldBeTheWinner() {

        board.mark(0, 0);
        assertNull(board.getWinner());

        board.mark(1, 0);
        assertNull(board.getWinner());

        board.mark(0, 1);
        assertNull(board.getWinner());

        board.mark(2, 1);
        assertNull(board.getWinner());

        board.mark(0, 2);
        assertEquals(Player.X, board.getWinner());
    }

    @Test
    public void when3inRowDiagonalFromTopLeftToBottomForO_OShouldBeTheWinner() {

        board.mark(0, 1);
        assertNull(board.getWinner());

        board.mark(0, 0);
        assertNull(board.getWinner());

        board.mark(2, 1);
        assertNull(board.getWinner());

        board.mark(1, 1);
        assertNull(board.getWinner());

        board.mark(0, 2);
        assertNull(board.getWinner());

        board.mark(2, 2);
        assertEquals(Player.O, board.getWinner());

    }

}
