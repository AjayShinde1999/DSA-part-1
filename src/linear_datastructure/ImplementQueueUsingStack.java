package linear_datastructure;

import java.util.Stack;

public class ImplementQueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int num) {
        s1.push(num);
    }

    public int dequeue() {
        int n1 = s1.size();
        for (int i = 1; i <= n1 - 1; i++) { // 1, 2,
            int temp = s1.pop();
            s2.push(temp);
        }

        int last = s1.pop();
        int n2 = s2.size();
        for (int i = 1; i <= n2; i++) {
            int temp = s2.pop();
            s1.push(temp);
        }

        return last;
    }


    public static void main(String[] args) {
        ImplementQueueUsingStack i = new ImplementQueueUsingStack();

        i.enqueue(10);
        i.enqueue(20);
        i.enqueue(30);
        System.out.println(i.dequeue());
        System.out.println(i.s1);
        System.out.println("///////////////////////////////");
        i.dequeue();
        System.out.println(i.s1);
        i.dequeue();
        System.out.println(i.s1);
    }
}

