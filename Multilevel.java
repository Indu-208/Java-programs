class A
{
	void display()
	{
		System.out.println("grand father");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("father");
	}
}
class C extends B
{
	void msg()
	{
		System.out.println("son");
	}
}
class Multilevel
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.display();
		obj.show();
		obj.msg();
	}
}
