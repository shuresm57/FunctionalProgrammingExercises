package functionalprogrammingintro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        list.forEach(consumer);
    }

    static void forEachString(List<String> list, Consumer<String> consumer) {
        list.forEach(consumer);
    }

    public static void main(String[] args) {


        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
        toUpper.accept("Viggo Mortensen");

        Consumer<Long> square = t -> System.out.println(t*t);
        square.accept(50l);

        List<String> lstStr = Arrays.asList("Hej", "med", "dig");
        forEachString(lstStr, toUpper);
        forEach(lstStr, toUpper);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> out = System.out::println;
        forEach(list, out);
    }

}
