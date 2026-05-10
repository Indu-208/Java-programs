import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("A");

        int count = Collections.frequency(list, "A");

        System.out.println("Frequency of A: " + count);
    }
}