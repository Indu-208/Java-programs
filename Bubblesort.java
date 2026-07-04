import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {5, 3, 8, 1, 2};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int x : a)
            System.out.print(x + " ");
    }
}