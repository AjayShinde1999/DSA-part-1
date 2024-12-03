package java_8;

import java.util.Arrays;
import java.util.List;

public class MinNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(13, 23, 56, 7, 68, 67, 242, 34);
        Integer min = numbers.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println(min);

        Integer mini = numbers.stream().min(Integer::compareTo).get();
        System.out.println(mini);

        Integer integer = numbers.stream().sorted().findFirst().get();
        System.out.println(integer);

    }
}
