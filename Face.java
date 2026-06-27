import java.util.Scanner;

public class Face {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Face Mask Detection Simulator ======");
        System.out.print("Are you wearing a face mask? (Yes/No): ");
        String response = sc.nextLine();

        if (response.equalsIgnoreCase("Yes")) {
            System.out.println("Mask Detected");
            System.out.println("Access Granted. Welcome!");
        } else if (response.equalsIgnoreCase("No")) {
            System.out.println(" No Mask Detected");
            System.out.println("Access Denied. Please wear a face mask.");
        } else {
            System.out.println("⚠ Invalid Input! Please enter Yes or No.");
        }

        sc.close();
    }
}