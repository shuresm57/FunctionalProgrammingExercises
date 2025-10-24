package interfaces;

@FunctionalInterface
public interface FourArgument<A, B, C, D> {
    double myFunc(A a, B b, C c, D d);
}