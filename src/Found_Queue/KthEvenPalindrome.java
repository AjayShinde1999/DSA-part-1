package Found_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class KthEvenPalindrome {
    public static void main(String[] args) {
        System.out.println(kthEvenPalindrome(3));
    }

    public static String kthEvenPalindrome(int k) {
        Queue<String> queue = new LinkedList<>();
        queue.add("11");
        queue.add("22");

        String ans = "";
        for (int i = 1; i <= k; i++) {
            String temp = queue.remove();
            ans = temp;
            String left = temp.substring(0, temp.length() / 2);
            String right = temp.substring(temp.length() / 2, temp.length());
            queue.add(left + "11" + right);
            queue.add(left + "22" + right);
        }
        return ans;
    }
}
