package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheString {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "mango", "pineapple", "banana");
        List<String> collect = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
