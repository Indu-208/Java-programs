import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];
            if (map.containsKey(needed)) {
                System.out.println(Arrays.toString(
                    new int[]{map.get(needed), i}));
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No solution found");
    }
}
