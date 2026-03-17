class callingCurrentClassMethod
{
	void show()
	{
		System.out.println("show method is invoked");
	}
	void display()
	{
		show();
		System.out.println("display method is invoked");
	}
	public static void main(String args[])
	{
		callingCurrentClassMethod c=new callingCurrentClassMethod();
		c.display();
	}
}