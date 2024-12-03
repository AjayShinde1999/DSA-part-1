package Found_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class KthNumber {
    public static void main(String[] args) {
        System.out.println(kth(5));
    }

    public static String kth(int k) {
        Queue<String> queue = new LinkedList<>();

        queue.add("1");
        queue.add("2");

        String ans = "";
        for (int i = 1; i <= k; i++) {
            String temp = queue.remove();
            ans = temp;
            queue.add(temp + "1");
            queue.add(temp + "2");
        }
        return ans;
    }
}
