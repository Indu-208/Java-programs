import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);

        list2.add(30);
        list2.add(40);

        list1.addAll(list2);

        System.out.println("Merged List: " + list1);
    }
}