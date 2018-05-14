package com.acme.tictactoe.model;

import static com.acme.tictactoe.model.Player.O;
import static com.acme.tictactoe.model.Player.X;

public class Table {

    private Cell[][] cells = new Cell[3][3];
    private Player winner;
    private GameState state;
    private Player currentTurn;

    private enum GameState {IN_PROGRESS, FINISHED}

    public Table() {
        restart();
    }

    public void restart() {
        clearCells();
        this.winner = null;
        this.currentTurn = Player.X;
        this.state = GameState.IN_PROGRESS;
    }

    public Player mark(int row, int col) {

        Player playerThatMoved = null;

        if (isValid(row, col)) {

            cells[row][col].setPlayer(currentTurn);
            playerThatMoved = currentTurn;

            if (isWinningMoveByPlayer(currentTurn, row, col)) {
                state = GameState.FINISHED;
                winner = currentTurn;

            } else {
                flipCurrentTurn();
            }
        }

        return playerThatMoved;
    }

    public Player getWinner() {
        return winner;
    }

    private void clearCells() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private boolean isValid(int row, int col) {
        return state != GameState.FINISHED && isOutOfBounds(row) && isOutOfBounds(col) && !isCellValueAlreadySet(row, col);
    }

    private boolean isOutOfBounds(int idx) {
        return idx >= 0 && idx <= 2;
    }

    private boolean isCellValueAlreadySet(int row, int col) {
        return cells[row][col].getPlayer() != null;
    }

    private boolean isWinningMoveByPlayer(Player player, int currentRow, int currentCol) {

        return (cells[currentRow][0].getPlayer() == player
                && cells[currentRow][1].getPlayer() == player
                && cells[currentRow][2].getPlayer() == player
                || cells[0][currentCol].getPlayer() == player
                && cells[1][currentCol].getPlayer() == player
                && cells[2][currentCol].getPlayer() == player
                || currentRow == currentCol
                && cells[0][0].getPlayer() == player
                && cells[1][1].getPlayer() == player
                && cells[2][2].getPlayer() == player
                || currentRow + currentCol == 2
                && cells[0][2].getPlayer() == player
                && cells[1][1].getPlayer() == player
                && cells[2][0].getPlayer() == player);
    }

    private void flipCurrentTurn() {
        currentTurn = currentTurn == X ? O : X;
    }
}
