class MethodOverloading
{
	int add(int a)
	{
		return a+10;
	}
	int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		MethodOverloading obj=new MethodOverloading();
		System.out.println(obj.add(20));
		System.out.println(obj.add(30,40));	
	}
}