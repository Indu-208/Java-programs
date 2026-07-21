import java.util.Scanner;

public class WeatherAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if(temp > 40)
            System.out.println("Heat Wave Alert");
        else if(temp < 10)
            System.out.println("Cold Wave Alert");
        else
            System.out.println("Normal Weather");

        sc.close();
    }
}