package functionalprogrammingexercises;

import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date");
        words.forEach(System.out::println);
    }

}
