import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}