package java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 3, 6, 5, 7);

//        List<Integer> collect = Stream.concat(list1.stream(), list2.stream()).sorted().distinct().collect(Collectors.toList());
//        System.out.println(collect);

        TreeSet<Integer> set = new TreeSet<>(list1);
        set.addAll(list2);

        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
