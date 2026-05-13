import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Banana");
        list.add("Apple");
        list.add("Mango");

        Collections.sort(list);

        System.out.println(list);
    }
}