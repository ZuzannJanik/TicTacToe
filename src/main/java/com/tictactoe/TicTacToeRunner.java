package com.tictactoe;

import static com.tictactoe.Board.board;
import static com.tictactoe.Results.*;

public class TicTacToeRunner {
    public static void main(String[] args) {

        Menu menu = new Menu();

        while (!gameOver()) {
            board();
            menu.menu();
        }
        board();
    }
}