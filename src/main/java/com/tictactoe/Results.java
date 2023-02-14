package com.tictactoe;
import static com.tictactoe.Menu.*;

public class Results {
    public static boolean gameOver() {
        if ((getMove1() != " ") && ((getMove1() == getMove2()) && (getMove1() == getMove3()))) {
            System.out.println("Win " + getMove1());
            return true;
        } else if ((getMove1() != " ") && ((getMove1() == getMove4()) && (getMove1() == getMove7()))) {
            System.out.println("Win " + getMove1());
            return true;
        } else if ((getMove1() != " ") && ((getMove1() == getMove5()) && (getMove1() == getMove9()))) {
            System.out.println("Win " + getMove1());
            return true;
        } else if ((getMove4() != " ") && ((getMove4() == getMove5()) && (getMove4() == getMove6()))) {
            System.out.println("Win " + getMove4());
            return true;
        } else if ((getMove7() != " ") && ((getMove7() == getMove8()) && (getMove7() == getMove9()))) {
            System.out.println("Win " + getMove7());
            return true;
        } else if ((getMove7() != " ") && ((getMove7() == getMove5()) && (getMove7() == getMove3()))) {
            System.out.println("Win " + getMove7());
            return true;
        } else if ((getMove2() != " ") && ((getMove2() == getMove5()) && (getMove2() == getMove8()))) {
            System.out.println("Win " + getMove2());
            return true;
        } else if ((getMove3() != " ") && ((getMove3() == getMove6()) && (getMove3() == getMove9()))) {
            System.out.println("Win " + getMove3());
            return true;
        } else if (getMove1() != " " && getMove2() != " " && getMove3() != " " && getMove4() != " " && getMove5() != " " && getMove6() != " " && getMove7() != " " && getMove8() != " " && getMove9() != " ") {
            System.out.println("Nobody win. DRAW");
            return true;
        }
        return false;
    }
}




