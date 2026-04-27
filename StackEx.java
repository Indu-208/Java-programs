import java.util.*;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}