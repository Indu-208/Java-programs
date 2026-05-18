import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        Collections.swap(list, 0, 2);

        System.out.println(list);
    }
}