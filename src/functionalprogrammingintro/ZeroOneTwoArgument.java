package functionalprogrammingintro;

import interfaces.*;

public class ZeroOneTwoArgument {

    public static void printZero(ZeroArgument z0){
        z0.myFunc();
    }

    public static void argAsParameter(OneArgument one){
        one.myFunc("Hello from the other side (the side of which I am now a method)");
    }

    public static void main(String[] args) {
        ZeroArgument z = () -> System.out.println("Hello i am interface");
        printZero(z);

        OneArgument out = (str) -> System.out.println(str);
        out.myFunc("Hello");
        OneArgument out2 = System.out::println;
        out2.myFunc("Hello");

        TwoArgument two = (x,y) -> x+y;
        int sum1 = two.myFunc(2,4);
        System.out.println(sum1);
        TwoArgument two2 = (x,y) -> x*y;
        int sum2 = two2.myFunc(2,4);
        System.out.println(sum2);

        argAsParameter(out2);
    }
}
