import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "C");
        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println("Sorted Map: " + map);
    }
}