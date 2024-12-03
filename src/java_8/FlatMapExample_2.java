package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample_2 {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> collect = nestedList.stream().flatMap(list -> list.stream()).filter(list -> list % 2 == 0).collect(Collectors.toList());
        collect.forEach(n -> System.out.println(n));
    }
}
