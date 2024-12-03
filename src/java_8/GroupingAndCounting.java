package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndCounting {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "mango", "pineapple", "banana");
        Map<String, Long> collect = fruits.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(collect);
    }
}
