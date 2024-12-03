package Found_Queue;

import java.util.Stack;

public class ImplementedQueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int val) {
        s1.push(val);
    }

    int dequeue() {
        int n1 = s1.size();
        for (int i = 1; i <= n1 - 1; i++) {
            int temp = s1.pop();
            s2.push(temp);
        }

        int ans = s1.pop();
        int n2 = s2.size();
        for (int i = 1; i <= n2; i++) {
            int temp = s2.pop();
            s1.push(temp);
        }
        return ans;
    }


    public static void main(String[] args) {
        ImplementedQueueUsingStack stack = new ImplementedQueueUsingStack();
        stack.enqueue(10);
        stack.enqueue(5);
        stack.enqueue(23);
        stack.enqueue(11);

        System.out.println(stack.dequeue());

    }
}
