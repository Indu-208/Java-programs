import java.util.*;
class AssignCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] g = new int[n];
        for (int i = 0; i < n; i++)
            g[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int[m];
        for (int i = 0; i < m; i++)
            s[i] = sc.nextInt();
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s[j] >= g[i])
                i++;
            j++;
        }
        System.out.println(i);
    }
}