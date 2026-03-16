class refferingInstanceVariable
{
	int x;
	refferingInstanceVariable(int x)
	{
		this.x=x;
	}
	void display()
	{
		System.out.println("x value:"+x);
	}
	public static void main(String args[])
	{
		refferingInstanceVariable r=new refferingInstanceVariable(10);
		r.display();
	}
}