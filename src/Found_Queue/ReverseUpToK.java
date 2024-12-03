package Found_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseUpToK {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);
        queue.add(10);
        queue.add(30);
        queue.add(5);
        queue.add(11);
        queue.add(7);

        int k = 4;

        System.out.println(reverseUpToK(queue, k));
    }

    public static Queue<Integer> reverseUpToK(Queue<Integer> q, int k) {

        Stack<Integer> st = new Stack<>();

        for (int i = 1; i <= k; i++) {
            int temp = q.remove();
            st.push(temp);
        }

        for (int i = 1; i <= k; i++) {
            int temp = st.pop();
            q.add(temp);
        }

        int n = q.size();
        for (int i = 1; i <= n - k; i++) {
            int temp = q.remove();
            q.add(temp);
        }
        return q;
    }
}
