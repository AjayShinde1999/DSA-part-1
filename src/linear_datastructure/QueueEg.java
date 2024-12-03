package linear_datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEg {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        // [A, B, C, D]

        System.out.println(queue.remove());
        System.out.println(queue.peek());

    }
}
