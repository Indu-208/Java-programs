import java.util.*;
class constructorOverloading
{
	int age;
	String name;
	constructorOverloading()
	{
		age=10;
		name="vinny";
	}
	constructorOverloading(int a)
	{
		age=a;
	}
	constructorOverloading(int a,String n)
	{
		age=a;
		name=n;
	}
	void display()
	{
		System.out.println("name:" + name + " age:" +age);
	}
	public static void main(String args[])
	{
		constructorOverloading obj = new constructorOverloading(20,"Indhu");
		obj.display();
	}
}
