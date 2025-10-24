package functionalprogrammingexercises;

import java.util.function.BiFunction;

public class Exercise1 {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        int sum = add.apply(5, 10);
        System.out.println(sum);
    }

}
