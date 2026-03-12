class MethodWithReturnType
{
	int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		MethodWithReturnType m=new MethodWithReturnType();
		System.out.println(m.add(4,4));
	}
}