import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = text.trim().split("\\s+");

        System.out.println("Word Count: " + words.length);

        sc.close();
    }
}