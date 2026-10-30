import java.util.*;

class Subset {
    static void subsets(int[] a, int start, List<Integer> path) {
        System.out.println(path);

        for (int i = start; i < a.length; i++) {
            if (i > start && a[i] == a[i - 1])
                continue;

            path.add(a[i]);
            subsets(a, i + 1, path);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        subsets(a, 0, new ArrayList<>());
    }
}