class FinalKeyEx
{
	final int a=20;
	void show()
	{
		a=20;
		System.out.println("integer value:");
	}
	public static void main(String args[])
	{
		FinalKeyEx obj = new FinalKeyEx();
		obj.show();	
	}
}