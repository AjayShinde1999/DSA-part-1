package Functional_Interface;

import java.util.function.Supplier;

public class SupplierExample_1 {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            return "Hello World";
        };

        String s1 = s.get();
    }
}
