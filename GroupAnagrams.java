import java.util.*;
class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, List<String>> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        System.out.println(map.values());
        sc.close();
    }
}