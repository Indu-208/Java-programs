import java.util.*;

class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        list.remove("Python");
        System.out.println(list);
    }
}