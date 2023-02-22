package com.tictactoe;

import java.util.Random;
import java.util.Scanner;
import static com.tictactoe.Menu.*;

public class GameWithComputer {

    //public void menu() throws ScannerException {


    public void gameWithComputer() {
        Random random = new Random();
        int computerMove = random.nextInt(9) + 1;

            switch (computerMove) {
                case 1:
                    if (move1 == " ") {
                        move1 = playerMove;
                    } else {
                        gameWithComputer();
                    }
                    break;
                case 2:
                    if (move2 == " ") {
                        move2 = playerMove;
                    } else {
                        gameWithComputer();
                    }
                    break;
                case 3:
                    if (move3 == " ") {
                        move3 = playerMove;
                    } else {
                        gameWithComputer();
                    }
                    break;
                case 4:
                    if (move4 == " ") {
                        move4 = playerMove;
                    } else {
                        gameWithComputer();
                    }
                    break;
                case 5:
                    if (move5 == " ") {
                    } else {
                        gameWithComputer();
                    }
                    break;
                case 6:
                    if (move6 == " ") {
                        move6 = playerMove;
                    } else {
                        gameWithComputer();
                    }
                    break;
                case 7:
                    if (move7 == " ") {
                        move7 = playerMove;
                    } else {
                        gameWithComputer();
                    }
                    break;
                case 8:
                    if (move8 == " ") {
                        move8 = playerMove;
                    } else {
                        gameWithComputer();
                    }
                    break;
                case 9:
                    if (move9 == " ") {
                        move9 = playerMove;
                    } else {
                        gameWithComputer();
                    }
                    break;
                default:
                    player--;
                    break;
            }
        }
    }
