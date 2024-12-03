package part_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 1, 7, 5, 2, 9);
        List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);
    }
}
