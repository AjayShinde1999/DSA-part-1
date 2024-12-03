package part_5;

import java.util.Arrays;
import java.util.List;

public class FindMinNumberUsingStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 1, 7, 5, 2, 9);

        Integer min = list.stream().sorted().findFirst().get();
        System.out.println(min);

        Integer minNumber = list.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println(minNumber);

        Integer minNo = list.stream().min(Integer::compareTo).get();
        System.out.println(minNo);
    }
}
