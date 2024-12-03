package java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 32, 4, 32, 53, 34, 86, 43);

        Integer max = numbers.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println(max);

        Integer maxi = numbers.stream().max(Integer::compareTo).get();
        System.out.println(maxi);

        Integer integer = numbers.stream().sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(integer);
    }
}
