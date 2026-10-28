import java.util.*;
class KthLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), min = Integer.MAX_VALUE;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            min = Math.min(min, a[i]);
        }
        long moves = 0;
        for (int x : a) moves += x - min;
        System.out.println(moves);
    }
}