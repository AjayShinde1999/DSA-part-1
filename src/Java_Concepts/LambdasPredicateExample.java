package Java_Concepts;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdasPredicateExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 22, 11, 4, 3, 54, 80);
        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Integer> collect = list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(collect);
    }
}
