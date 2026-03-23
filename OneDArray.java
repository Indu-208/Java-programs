
import java.util.*;
class OneDArray
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a[ ]=new int[5];
System.out.println("Enter Array Elements:");
for(int i=0;i<a.length;i++)
{
a[i]=Sc.nextInt();
}
System.out.println("The Array Is:");
for(int i=0;i<a.length;i++)
{
System.out.print(" "+a[i]);
}
}
}
