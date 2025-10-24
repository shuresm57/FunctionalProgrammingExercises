package functionalprogrammingexercises;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Exercise3 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Set<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 ==0).collect(Collectors.toSet());
        evenNumbers.forEach(System.out::println);

    }
}
