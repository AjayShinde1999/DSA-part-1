package Functional_Interface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> evenNumber = (Integer num) -> num % 2 == 0;

        boolean test = evenNumber.test(20);
        System.out.println(test);
    }
}
