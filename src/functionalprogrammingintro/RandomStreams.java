package functionalprogrammingintro;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class RandomStreams {

    public static void main(String[] args) {

        Supplier<Double> random = () -> Math.random();
        Stream<Double> randomNumbers = Stream.generate(() -> random.get());
        //randomNumbers.forEach(System.out::println);

        Function<Double, Long> dblround = d -> Math.round(d*100);
        Predicate<Long> longEqual = rannum -> rannum % 2 == 0;
        var obj = randomNumbers.map(dblround).filter(longEqual).limit(12);
        obj.forEach(System.out::println);

        Stream<Long> ranLong = randomNumbers.map(dblround).filter(longEqual).limit(12);
        DoubleStream randbl = ranLong.mapToDouble(d -> d);
        //System.out.println("Max: " + randbl.max());
        System.out.println("Average: " + randbl.average());
    }
}
