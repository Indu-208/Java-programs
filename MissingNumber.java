public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};
        int n = 6;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int x : a)
            actual += x;
        System.out.println("Missing: " + (expected - actual));
    }
}