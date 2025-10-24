package functionalprogrammingintro;

import java.time.LocalDate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DatesStream {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2025, 8, 28);

        Stream<LocalDate> tenDates = IntStream.range(1,10).mapToObj(i -> birthday.plusYears(i));
        var obj = tenDates.map(date -> "Year = " + date.getYear() + " Day of week = " + date.getDayOfWeek());
        obj.forEach(System.out::println);


    }

}
