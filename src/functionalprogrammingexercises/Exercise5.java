package functionalprogrammingexercises;

import java.util.Optional;

public class Exercise5 {

    public static void main(String[] args) {
        String str = "Hej med dig";
        Optional<String> optionalValue = Optional.ofNullable(str);
        optionalValue.ifPresent(System.out::println);
    }

}
