package pkg2;

public class Cons1 
{
	public Cons1()
	{
		this(11,22,33);
		System.out.println("Parent Default Constructor");
	}
	public Cons1(int a)
	{
		this();
		System.out.println("Parent 1 Parameterized Constructor");
	}
	public Cons1(int a,int b)
	{
		this(11);
		System.out.println("Parent 2 Parameterized Constructor");
	}
	public Cons1(int a,int b,int c)
	{
		System.out.println("Parent 3 Parameterized Constructor");
	}

}
