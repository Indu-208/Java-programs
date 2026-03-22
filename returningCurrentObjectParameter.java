class returningCurrentObjectParameter
{
	returningCurrentObjectParameter getmsg()
	{
		return this;
	}
	void display()
	{
		System.out.println("hello this returning current object");
	}
	public static void main(String args[])
	{
		returningCurrentObjectParameter r=new returningCurrentObjectParameter();
		r.getmsg().display();
	}
}