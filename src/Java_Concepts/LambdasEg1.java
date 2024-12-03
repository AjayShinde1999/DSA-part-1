package Java_Concepts;

@FunctionalInterface
interface ArithmeticOperation {

    int operate(int a, int b);
}

public class LambdasEg1 {
    public static void main(String[] args) {
        ArithmeticOperation operation = (a, b) -> {
            System.out.println("Inside the lambdas");
            return a + b;
        };

        int operate = operation.operate(2, 2);
        System.out.println(operate);
    }
}
