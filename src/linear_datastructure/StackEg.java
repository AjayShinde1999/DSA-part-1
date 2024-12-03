package linear_datastructure;

import java.util.Stack;

public class StackEg {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        // [A, B, C, D]
        System.out.println(stack);

        System.out.println(stack.peek()); //D
        System.out.println(stack.pop()); // D
        System.out.println(stack); // A B C
        boolean empty = stack.isEmpty();
        System.out.println(empty);
        int a = stack.search("A");
        System.out.println(a);
    }
}
