import java.util.*;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(101, "Indhu");
        map.put(102, "Ravi");
        map.put(103, "Kiran");

        System.out.println(map);
    }
}