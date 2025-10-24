package functionalprogrammingexercises;

import interfaces.StringToInt;
import org.w3c.dom.ls.LSOutput;

public class Exercise2 {

    public static void main(String[] args) {
        StringToInt intToString = (i) -> "Number: " + i;
        System.out.println(intToString.convert(5));
    }
}
