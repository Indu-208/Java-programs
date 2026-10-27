import java.util.*;
class Permutations {
    static void permute(int[] a, boolean[] used,
                        List<Integer> path, List<List<Integer>> res) {
        if (path.size() == a.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (used[i]) continue;
            if (i > 0 && a[i] == a[i - 1] && !used[i - 1])
                continue;
            used[i] = true;
            path.add(a[i]);
            permute(a, used, path, res);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        List<List<Integer>> res = new ArrayList<>();
        permute(a, new boolean[n], new ArrayList<>(), res);
        System.out.println(res);
        sc.close();
    }
}