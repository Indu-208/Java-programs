public class ReverseString {
    public static void main(String[] args) {
        String s = "Java";
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        System.out.println(result);
    }
}