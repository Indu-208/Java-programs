import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Amount: ");
            balance += sc.nextDouble();
        } else if (choice == 2) {
            System.out.print("Amount: ");
            double amt = sc.nextDouble();
            if (amt <= balance)
                balance -= amt;
            else
                System.out.println("Insufficient Balance");
        }

        System.out.println("Balance: " + balance);
        sc.close();
    }
}