import java.util.*;
class Control
{
	int a=10;
	public int b=20;
	private int c=30;
	protected int d=40;
	void show()
	{
		System.out.println("default variable valur:"+a);
		System.out.println("public variable value:"+b);
		System.out.println("private variable value:"+c);
		System.out.println("protected variable value:"+d);
	}
}
class AccessModifiers
{
	public static void main(String args[])
	{
		Control obj=new Control();
		System.out.println("default variable value:"+obj.a);
		System.out.println("public variable value:"+obj.b);
		//System.out.println("private variable value:"+obj.c);
		System.out.println("protected variable value:"+obj.d);
		obj.show();
	}
}
