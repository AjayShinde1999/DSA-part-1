package part_5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateUsingStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 3, 4, 4,4, 1, 7, 5, 2, 2, 9, 2);
        HashSet<Integer> set = new HashSet<>();
        Set<Integer> collect = list.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
