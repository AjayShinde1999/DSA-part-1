package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ascending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 5, 2, 9, 3, 1, 0);
        List<Integer> asc = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(asc);

        for (Integer i : asc) {
            System.out.println(i);
        }

    }
}
