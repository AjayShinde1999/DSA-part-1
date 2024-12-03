package java_8;

import java.util.Arrays;
import java.util.List;

public class SecondMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(213, 42, 23, 6, 67, 54, 46, 75);
        Integer num = numbers.stream().sorted().skip(1).findFirst().get();
        System.out.println(num);
    }
}
