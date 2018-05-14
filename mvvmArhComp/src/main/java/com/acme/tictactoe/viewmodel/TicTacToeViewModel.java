package com.acme.tictactoe.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;

import com.acme.tictactoe.model.Player;
import com.acme.tictactoe.model.Table;

public class TicTacToeViewModel extends ViewModel {

    private Table table;
    public ObservableArrayMap<String, String> cells;
    public ObservableField<String> winner;

    public TicTacToeViewModel() {
        this.table = new Table();
        this.cells = new ObservableArrayMap<>();
        this.winner = new ObservableField<>();
    }

    public void onResetSelected() {
        table.restart();
        winner.set(null);
        cells.clear();
    }

    public void onClickedCellAt(int row, int col) {
        Player playerThatMoved = table.mark(row, col);
        if (playerThatMoved != null) {
            cells.put("" + row + col, playerThatMoved.toString());
        }
        winner.set(table.getWinner() == null ? null : table.getWinner().toString());
    }
}
