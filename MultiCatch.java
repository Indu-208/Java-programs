class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            int arr[] = new int[3];
            arr[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error");
        }
    }
}