package functionalprogrammingintro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CharAndStrings {


    public static void main(String[] args) {
        String vowels = "aeiouyøæå";
        Predicate<Character> isVowel = (p) -> vowels.indexOf(p) != -1;

        List<Character> list = Arrays.asList('a', 'b', 'i', 'q', 'u');
        List<Character> vowelList = list.stream().filter(isVowel).toList();
        vowelList.forEach(System.out::println);

        long vowelCount = "Hej hvor er du".chars().mapToObj(c -> (char) c).filter(isVowel).count();
        System.out.println(vowelCount);

        List<String> strings = List.of("hej","hvor","er","du");

        var obj = strings.stream().flatMapToInt(s -> s.chars());

        obj.forEach(a -> System.out.println((char) a));
        long listCount = strings.stream().flatMapToInt(s -> s.chars()).mapToObj(c -> (char) c).filter(isVowel).count();
        System.out.println(listCount);
    }


}
