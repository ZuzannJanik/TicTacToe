package com.tictactoe;

import java.util.Scanner;

public class PlayerChoice {
    public void playerChoice() {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        GameWithComputer gameWithComputer = new GameWithComputer();

        System.out.println("Press 1 for 1 vs 1 game");
        System.out.println("Press 1 for 1 vs Computer game");

        int gameMode = scanner.nextInt();

        switch (gameMode) {
            case 1:
                System.out.println("You have chosen a game 1 vs 1");
                menu.menu();
                break;
            case 2:
                System.out.println("You have chosen a game 1 vs Computer");
                gameWithComputer.gameWithComputer();
                break;
        }
    }
}
