package com.acme.tictactoe.viewModel;


import com.acme.tictactoe.viewmodel.TicTacToeViewModel;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class TicTacToeViewModelTests {

    private TicTacToeViewModel viewModel;

    @Before
    public void setup() {
        viewModel = new TicTacToeViewModel();
    }

    private void clickAndAssertValueAt(int row, int col, String expectedValue) {
        viewModel.onClickedCellAt(row, col);
        assertEquals(expectedValue, viewModel.cells.get("" + row + col));
    }

    @Test
    public void when3inRowAcrossTopForX_xShouldBeTheWinner() {

        clickAndAssertValueAt(0, 0, "X");
        assertNull(viewModel.winner.get());

        clickAndAssertValueAt(1, 0, "O");
        assertNull(viewModel.winner.get());

        clickAndAssertValueAt(0, 1, "X");
        assertNull(viewModel.winner.get());

        clickAndAssertValueAt(2, 1, "O");
        assertNull(viewModel.winner.get());

        clickAndAssertValueAt(0, 2, "X");
        assertEquals("X", viewModel.winner.get());
    }

    @Test
    public void when3inRowDiagonalFromTopLeftToBottomForO_OShouldBeTheWinner() {

        clickAndAssertValueAt(0, 1, "X");
        assertNull(viewModel.winner.get());

        clickAndAssertValueAt(0, 0, "O");
        assertNull(viewModel.winner.get());

        clickAndAssertValueAt(2, 1, "X");
        assertNull(viewModel.winner.get());

        clickAndAssertValueAt(1, 1, "O");
        assertNull(viewModel.winner.get());

        clickAndAssertValueAt(0, 2, "X");
        assertNull(viewModel.winner.get());

        clickAndAssertValueAt(2, 2, "O");
        assertEquals("O", viewModel.winner.get());

    }


}
