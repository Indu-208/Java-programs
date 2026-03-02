import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
System.out.println("Enter n value:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int t1=0,t2=1,t3;
System.out.println(" " + t1 + " " + t2);
for(int i=2;i<n;i++)
{
t3=t1+t2;
System.out.println(" " +t3);
t1=t2;
t2=t3;
}
}
}