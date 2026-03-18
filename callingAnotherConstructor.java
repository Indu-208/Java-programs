class callingAnotherConstructor
{
	callingAnotherConstructor()
	{
		System.out.println("default constructor");
	}
	callingAnotherConstructor(int x)
	{
		this();
		System.out.println("parametrized constructor:"+x);
	}
	public static void main(String args[])
	{
		new callingAnotherConstructor(10);
	}
}