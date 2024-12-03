package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxAndMinUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> optional = numbers.stream().reduce((a, b) -> a > b ? a : b);
        optional.ifPresent(max -> System.out.println(max));

        Optional<Integer> optional1 = numbers.stream().reduce((a, b) -> a < b ? a : b);
        optional1.ifPresent(min -> System.out.println(min));

    }
}
