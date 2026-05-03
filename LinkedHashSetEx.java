import java.util.*;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("Java"); 

        System.out.println(set);
    }
}