package java_8;

import java.util.Arrays;
import java.util.List;

public class SumUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sun = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sun);

        int sum1 = numbers.stream().mapToInt(num -> num.intValue()).sum();
        System.out.println(sum1);

    }
}
