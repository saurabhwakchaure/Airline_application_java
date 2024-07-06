class Demo
{
	void test()
	{
		System.out.println("this is test");
	}
	static void fun(int choice)
	{
		System.out.println(choice);
		Demo.test();
	}
	
	public static void main(String args[])
	{
		int choice=1;
		System.out.println(choice);
		Demo d=new Demo();
		Demo.fun(choice);
		//d.fun(choice);
	}
}
