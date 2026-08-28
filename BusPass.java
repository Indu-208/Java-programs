import java.util.*;
public class BusPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        if (age <= 21)
            System.out.println("Eligible for Student Bus Pass");
        else
            System.out.println("Not Eligible");
        sc.close();
    }
}