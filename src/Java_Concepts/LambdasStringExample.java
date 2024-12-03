package Java_Concepts;

@FunctionalInterface
interface StringExample {

    String apply(String str);

}

public class LambdasStringExample {

    // example 2, with static
    static StringExample eg2 = (s) -> {
        return s.toLowerCase();
    };

    // example 4, non-static
    StringExample eg4 = (s) -> s.substring(1, 3);

    public static void main(String[] args) {

        // example 1
        StringExample eg1 = (s) -> {
            return s.toUpperCase();
        };

        // example 3
        StringExample eg3 = (s) -> new StringBuilder(s).reverse().toString();

        System.out.println(eg1.apply("Ajay"));
        System.out.println(eg2.apply("ROhan"));
        System.out.println(eg3.apply("Shinde"));

        LambdasStringExample example = new LambdasStringExample();
        System.out.println(example.eg4.apply("Ajay Shinde"));
    }
}
