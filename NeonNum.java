public class NeonNum {
    public static void main(String[] args) {
        int n = 9, square = n * n, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        System.out.println(sum == n ? "Neon" : "Not Neon");
    }
}