public class ExceptionHandling {

    public static void main(String[] args) {

       
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

                try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }
        finally {
            System.out.println("Finally block executed");
        }

                try {
            int age = 16;

            if(age < 18) {
                throw new ArithmeticException("Not eligible to vote");
            }
            else {
                System.out.println("Eligible to vote");
            }
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program finished successfully");
    }
}