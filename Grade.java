import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 subject marks: ");
        int sub1 = sc.nextInt();
	int sub2 = sc.nextInt();
	int sub3 = sc.nextInt();
	int sub4 = sc.nextInt();
	int sub5 = sc.nextInt();
	int total=sub1+sub2+sub3+sub4+sub5;
	int avg=total/5;
        if(avg>= 90)
            System.out.println("Grade A");
        else if(avg>= 75)
            System.out.println("Grade B");
        else if(avg>= 60)
            System.out.println("Grade C");
        else if(avg>= 40)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }
}
