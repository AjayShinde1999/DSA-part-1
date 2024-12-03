package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalHandling {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 6, 11, 9);
        // find first even number
        Optional<Integer> evenNumber = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        evenNumber.ifPresent(e -> System.out.println(e));

    }
}
