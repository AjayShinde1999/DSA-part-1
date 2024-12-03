package Functional_Interface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = (String name) -> name.length();

        Integer length = function.apply("AJAY");
        System.out.println(length);
    }
}
