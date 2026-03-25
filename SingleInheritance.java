class simple
{
	void display()
	{
		System.out.println("parent method");
	}
}
class SingleInheritance extends simple
{
	void say()
	{
		System.out.println("child method");
	}
	public static void main(String args[])
	{
		SingleInheritance s = new SingleInheritance();
		s.display();
		s.say();
	}
}