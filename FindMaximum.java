import java.util.*;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(45);
        list.add(12);
        list.add(78);
        list.add(23);

        int max = Collections.max(list);

        System.out.println("Maximum: " + max);
    }
}