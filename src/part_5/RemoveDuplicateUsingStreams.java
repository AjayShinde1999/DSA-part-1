package part_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 3, 4, 4, 1, 7, 5, 2, 2, 9, 2);
        List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);
    }

}
