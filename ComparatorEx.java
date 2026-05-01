import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorEx {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Ravi"));
        list.add(new Student(1, "Indhu"));
        list.add(new Student(2, "Kiran"));

        Collections.sort(list, new NameComparator());

        for(Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}