package functionalprogrammingexercises;

import interfaces.IntToSquare;
import interfaces.StringToInt;

public class Exercise6 {

    public static void main(String[] args) {
        IntToSquare intToSquare = (i) -> i * i;
        System.out.println("Square of 6 is: " + intToSquare.toSquare(6));
    }

}
