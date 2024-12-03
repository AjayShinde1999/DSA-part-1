package Functional_Interface;

interface A {
    void show(String message);
}

public class TestFunctionInterface {
    public static void main(String[] args) {
        A a1 = (String message) -> {
            System.out.println(message);
        };
        a1.show("Hello!");
    }
}
