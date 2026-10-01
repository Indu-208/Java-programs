import java.util.*;
class FindDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x : a) {
            int i = Math.abs(x) - 1;
            if (a[i] < 0)
                ans.add(Math.abs(x));
            else
                a[i] = -a[i];
        }
        System.out.println(ans);
    }
}