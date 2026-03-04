class ParametrizedCon
{
	int age;
	String name;
	ParametrizedCon(int a,String n)
	{
		age=a;
		name=n;
	}
	public static void main(String args[])
	{
		ParametrizedCon obj = new ParametrizedCon(10,"Honey");	
		System.out.println("name:" +obj.name);
		System.out.println("age:" +obj.age);
	}

}