package com.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public static String move1 = " ";
    public static String move2 = " ";
    public static String move3 = " ";
    public static String move4 = " ";
    public static String move5 = " ";
    public static String move6 = " ";
    public static String move7 = " ";
    public static String move8 = " ";
    public static String move9 = " ";
    public static String playerMove;

    static int player = 1;

    public static String getMove1() {
        return move1;
    }

    public static String getMove2() {
        return move2;
    }

    public static String getMove3() {
        return move3;
    }

    public static String getMove4() {
        return move4;
    }

    public static String getMove5() {
        return move5;
    }

    public static String getMove6() {
        return move6;
    }

    public static String getMove7() {
        return move7;
    }

    public static String getMove8() {
        return move8;
    }

    public static String getMove9() {
        return move9;
    }
    GameWithComputer gameWithComputer = new GameWithComputer();

    //public void menu() throws ScannerException {
    public void menu() {
        if (player == 1) {
            playerMove = "X";
            player++;

            System.out.println("Now it's " + playerMove +"'s turn");
            System.out.println("Choose box 1-9");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (move1 == " ") {
                        move1 = playerMove;
                    } else {
                        System.out.println("Box already occupied - choose a number from 1 to 9");
                        player--;
                    }
                    break;
                case 2:

                    if (move2 == " ") {
                        move2 = playerMove;
                    } else {
                        System.out.println("Box already occupied - choose a number from 1 to 9");
                        player--;
                    }
                    break;
                case 3:
                    if (move3 == " ") {
                        move3 = playerMove;
                    } else {
                        System.out.println("Box already occupied - choose a number from 1 to 9");
                        player--;
                    }
                    break;
                case 4:
                    if (move4 == " ") {
                        move4 = playerMove;
                    } else {
                        System.out.println("Box already occupied - choose a number from 1 to 9");
                        player--;
                    }
                    break;
                case 5:
                    if (move5 == " ") {
                        move5 = playerMove;
                    } else {
                        System.out.println("Box already occupied - choose a number from 1 to 9");
                        player--;
                    }
                    break;
                case 6:
                    if (move6 == " ") {
                        move6 = playerMove;
                    } else {
                        System.out.println("Box already occupied - choose a number from 1 to 9");
                        player--;
                    }
                    break;
                case 7:
                    if (move7 == " ") {
                        move7 = playerMove;
                    } else {
                        System.out.println("Box already occupied - choose a number from 1 to 9");
                        player--;
                    }
                    break;
                case 8:
                    if (move8 == " ") {
                        move8 = playerMove;
                    } else {
                        System.out.println("Box already occupied - choose a number from 1 to 9");
                        player--;
                    }
                    break;
                case 9:
                    if (move9 == " ") {
                        move9 = playerMove;
                    } else {
                        System.out.println("Box already occupied - choose a number from 1 to 9");
                        player--;
                    }
                    break;
                default:
                    //    throw new ScannerException();
                    System.out.println("Choose box 1-9");
                    player--;
                    break;
            }
        } else if (player == 2) {
            playerMove = "O";
            gameWithComputer.gameWithComputer();
            System.out.println("The computer made a move");
            player--;
        }

    }
}




