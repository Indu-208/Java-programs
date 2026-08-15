public class CommonElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};
        for (int x : a) {
            for (int y : b) {
                if (x == y) {
                    System.out.print(x + " ");
                    break;
                }
            }
        }
    }
}