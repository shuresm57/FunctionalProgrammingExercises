package functionalprogrammingintro;

import java.util.Arrays;
import java.util.List;
import interfaces.*;

public class CurrencyCalculator {

    public static int sumTwoFunction(List<Integer> list, TwoArgument two) {
        int sum = 0;
        for (int t : list) {
            sum += two.myFunc(t, t);
        }
        return sum;
    }

    public static int valutaOmregner(List<Integer> list, TwoArgument two, int kurs) {
        int sum = 0;
        for(int t : list) {
            sum += two.myFunc(t, kurs);
        }
        return sum;
    }

    public static Double valutaOmregnerDouble(List<Integer> list1, List<Double> list2, TwoArgumentDouble twoDouble, Double kurs) {
        double sum = 0;
        for(Integer t : list1) {
            sum += twoDouble.myFunc(t, kurs);
        }
        for(Double t : list2) {
            sum += twoDouble.myFunc(t, kurs);
        }
        return sum;
    }

    public static Double valutaOmregnerDoubleFunctional(List<Integer> list1,
                                                        List<Double> list2,
                                                        FourArgument<Double, Double, Double, Double> fourArgument,
                                                        Double kurs) {
        double sum = 0;
        for (Integer t : list1) {
            sum += fourArgument.myFunc(t.doubleValue(), kurs, 1.0, 1.0);
        }

        for (Double t : list2) {
            sum += fourArgument.myFunc(t, kurs, 1.0, 1.0);
        }
        return sum;
    }

    public static void main(String[] args)  {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        TwoArgument twoPlus = (x, y) -> x + y;
        int ss = sumTwoFunction(list, twoPlus);
        System.out.println(ss);

        TwoArgument twoMultiply = (x, y) -> x * y;
        TwoArgumentDouble twoMultiplyDouble = (x, y) -> x * y;
        ss = sumTwoFunction(list, twoMultiply);
        System.out.println(ss);

        List<Integer> dollarSedler = Arrays.asList(1, 5, 10);
        int pengeDk = valutaOmregner(dollarSedler, twoMultiply, 6);
        System.out.println("I danske kroner har du: " + pengeDk);

        List<Double> dollarMønter = Arrays.asList(0.1, 0.5, 0.25);
        double pengeDkSomDouble = valutaOmregnerDouble(dollarSedler,dollarMønter, twoMultiplyDouble, 6.6);
        System.out.println(pengeDkSomDouble);

        FourArgument<Double, Double, Double, Double> twoMultiplyDoubleFunctional = (a, b, c, d) -> a * b * c * d;

        double pengeDkSomDoubleFunctional = valutaOmregnerDoubleFunctional(dollarSedler, dollarMønter, twoMultiplyDoubleFunctional, 6.6);
        System.out.println(pengeDkSomDoubleFunctional);
    }
}