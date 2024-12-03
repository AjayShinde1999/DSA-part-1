package Java_Concepts;

import java.util.function.Function;

public class LambdaFunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> fun = (s) -> s.length();
        System.out.println(fun.apply("Ajay Shinde"));
    }
}
