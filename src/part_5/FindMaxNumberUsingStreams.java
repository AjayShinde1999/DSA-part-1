package part_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxNumberUsingStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 1, 7, 5, 2, 9);

        Integer max = list.stream().sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(max);

        Integer maxNumber = list.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println(maxNumber);

        Integer maxNo = list.stream().max(Integer::compareTo).get();
        System.out.println(maxNo);
    }
}
