import java.util.Scanner;

public class WiFiPasswordVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String wifiPassword = "Home@123";

        System.out.println("===== Wi-Fi Password Verification =====");

        System.out.print("Enter Wi-Fi Password: ");
        String enteredPassword = sc.nextLine();

        if (enteredPassword.equals(wifiPassword)) {
            System.out.println("\n Password Verified");
            System.out.println("Connected to Wi-Fi Successfully.");
        } else {
            System.out.println("\n Incorrect Password");
            System.out.println("Connection Failed. Please try again.");
        }

        sc.close();
    }
}