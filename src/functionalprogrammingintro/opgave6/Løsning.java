package functionalprogrammingintro.opgave6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class Løsning {

    public static void main(String[] args) {

        int år = 2025;

        LocalDate start = LocalDate.of(år, Month.MAY,1);
        LocalDate slut = LocalDate.of(år, Month.OCTOBER,1);

        List<String> bådtyper = List.of("Hanne", "Båd", "SeaShepard");

        List<LocalDate> onsdage = start.datesUntil(slut.plusDays(1))
                .filter(dato -> dato.getDayOfWeek() == DayOfWeek.WEDNESDAY)
                .collect(Collectors.toList());

        onsdage.forEach(System.out::println);

        List<KapSejlads> kapsejladser = onsdage.stream()
                .flatMap(dato -> bådtyper.stream()
                        .map(båd -> new KapSejlads(dato, båd)))
                .collect(Collectors.toList());

        kapsejladser.forEach(System.out::println);
    }


}
