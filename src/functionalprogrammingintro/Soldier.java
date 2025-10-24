package functionalprogrammingintro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Soldier {

    public String name;
    public int rank;

    public Soldier(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


    public static void main(String[] args) {
        List<Soldier> soldiers = new ArrayList<>();
        soldiers.add(new Soldier("Ron", 1));
        soldiers.add(new Soldier("Leslie", 2));
        soldiers.add(new Soldier("Tom", 3));
        soldiers.add(new Soldier("April", 4));
        soldiers.add(new Soldier("Andy", 5));

        soldiers.forEach(System.out::println);

        Predicate<Soldier> isHighRanked = s -> s.getRank() > 3;

        Stream<Soldier> highSoldiers = soldiers.stream().filter(isHighRanked);
        highSoldiers.forEach(System.out::println);

        Predicate<Soldier> aSoldiers = s -> s.getName().startsWith("A");
        Stream<Soldier> highAndA = soldiers.stream().filter(isHighRanked).filter(aSoldiers);
        highAndA.forEach(System.out::println);
        Function<Soldier, String> getNames = s -> s.getName();
        List<Soldier> highAndAList = highAndA.toList();
        List<String> names = highAndAList.stream().map(getNames).collect(Collectors.toList());
        names.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "functionalprogrammingintro.Soldier {" + " name = " + name + ", rank = " + rank + '}';
    }
}
