package Functional_Interface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c = (String message) -> System.out.println(message);
        c.accept("Hello! How r u?");
    }
}
