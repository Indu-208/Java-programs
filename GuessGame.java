import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int number = rand.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();

            if (guess > number)
                System.out.println("Too High");
            else if (guess < number)
                System.out.println("Too Low");
            else
                System.out.println("Correct!");
        } while (guess != number);

        sc.close();
    }
}