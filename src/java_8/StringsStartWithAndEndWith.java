package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsStartWithAndEndWith {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "mango", "pineapple", "banana");
        List<String> a = fruits.stream().filter(fruit -> fruit.startsWith("a")).collect(Collectors.toList());
        System.out.println(a);

        List<String> collect = fruits.stream().filter(fruit -> fruit.endsWith("e") && fruit.startsWith("p")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
