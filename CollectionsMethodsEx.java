import java.util.*;

public class CollectionsMethodsEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);
    }
}