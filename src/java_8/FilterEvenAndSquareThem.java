package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenAndSquareThem {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());
        collect.forEach(n -> System.out.println(n));
    }
}
