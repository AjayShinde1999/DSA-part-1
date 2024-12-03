package java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(321, 34, 4, 52, 421, 3);
        Integer num = numbers.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(num);

    }
}
