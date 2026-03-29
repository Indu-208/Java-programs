class A
{
	void display()
	{
		System.out.println("parent class method");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("child method 1");
	}
}
class C extends A
{
	void msg()
	{
		System.out.println("child method 2");
	}
}
class HierarichalIH
{
	public static void main(String args[])
	{
		B b=new B();
		C c=new C();
		b.display();
		b.show();
		c.msg();
	}
}