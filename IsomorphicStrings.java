import java.util.*;
class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int[] a = new int[256];
        int[] b = new int[256];
        boolean ok = true;
        for (int i = 0; i < s.length(); i++) {
            if (a[s.charAt(i)] != b[t.charAt(i)]) {
                ok = false;
                break;
            }
            a[s.charAt(i)] = i + 1;
            b[t.charAt(i)] = i + 1;
        }
        System.out.println(ok);
    }
}