package com.tictactoe;
import static com.tictactoe.Menu.*;
public class Board {
    public static void board() {
        System.out.println("|-------|" + "-------" + "|-------|");
        System.out.println("|1      |" + "2      " + "|3      |");
        System.out.println("|   " + getMove1() +"   |" + "   " + getMove2() + "   " + "|   " + getMove3() + "   |");
        System.out.println("|_______|" + "_______" + "|_______|");
        System.out.println("|4      |" + "5      " + "|6      |");
        System.out.println("|   " + getMove4() +"   |" + "   " + getMove5() + "   " + "|   " + getMove6() + "   |");
        System.out.println("|_______|" + "_______" + "|_______|");
        System.out.println("|7      |" + "8      " + "|9      |");
        System.out.println("|   " + getMove7() +"   |" + "   " + getMove8() + "   " + "|   " + getMove9() + "   |");
        System.out.println("|-------|" + "-------" + "|-------|");
    }
}