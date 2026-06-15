import java.util.Scanner;

public class SmartDoor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pin = "2026";

        System.out.print("Enter PIN: ");
        String input = sc.nextLine();

        if(pin.equals(input))
            System.out.println("Door Opened");
        else
            System.out.println("Wrong PIN");

        sc.close();
    }
}