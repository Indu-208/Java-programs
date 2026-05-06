import java.util.*;

public class ArrayDequeueEx {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<>();

        dq.add("A");
        dq.addFirst("B");
        dq.addLast("C");

        System.out.println(dq);

        dq.removeFirst();
        System.out.println(dq);
    }
}