import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
	HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); 
        System.out.println("HashSet elements: " + set);
        System.out.println("Contains Mango? " + set.contains("Mango"));
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);
        System.out.println("Size: " + set.size());
    }
}