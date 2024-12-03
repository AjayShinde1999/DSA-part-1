package java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductOfAllElementsUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);

        Integer secondMin = numbers.stream().sorted().skip(1).findFirst().get();
        System.out.println(secondMin);
        Integer secondMax = numbers.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondMax);
    }
}
