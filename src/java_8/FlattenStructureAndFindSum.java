package java_8;

import java.util.Arrays;
import java.util.List;

public class FlattenStructureAndFindSum {
    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        int sum = lists.stream().flatMap(list -> list.stream()).mapToInt(num -> num.intValue()).sum();
        System.out.println(sum);

        Integer integer = lists.stream().flatMap(list -> list.stream()).reduce((a, b) -> a + b).get();
        System.out.println(integer);
    }
}
