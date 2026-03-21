class passingCurrentObjectParameter
{
	void show(passingCurrentObjectParameter x)
	{
		System.out.println("current object parameter");
	}
	void call()
	{
		show(this);
	}
	public static void main(String args[])
	{
		passingCurrentObjectParameter p=new passingCurrentObjectParameter();
		p.call();
	}
}