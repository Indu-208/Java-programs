import java.util.*;
class FillCups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] cups = {a, b, c};
        Arrays.sort(cups);
        System.out.println(Math.max(cups[2],
                (cups[0] + cups[1] + cups[2] + 1) / 2));
    }
}