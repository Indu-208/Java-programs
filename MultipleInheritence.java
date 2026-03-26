interface A
{
	void display();
}
interface B
{
	void show();
}
class C implements A,B
{
	public void show()
	{
		System.out.println("method show is invoked");
	}
	public void display()
	{
		System.out.println("method display is invoked");
	}
}
class MultipleInheritence
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.display();
		obj.show();
	}
}