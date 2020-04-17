package pkg2;

public class Cons2 extends Cons1
{
	public Cons2()
	{
		this(11,22,33);
		System.out.println("Child Default Constructor");
	}
	public Cons2(int a)
	{
		this();
		System.out.println("Child 1 Parameterized Constructor");
	}
	public Cons2(int a,int  b)
	{
		this(11,22,33,44);
		System.out.println("Child 2 Parameterized Constructor");
	}
	public Cons2(int a,int  b,int c)
	{
		super(11,22);
		System.out.println("Child 3 Parameterized Constructor");
	}
	public Cons2(int a,int  b,int c,int d)
	{
		this(11);
		System.out.println("Child 4 Parameterized Constructor");
	}

	
	
	public static void main(String[] args) 
	{
		Cons2 ref=new Cons2(11,22);
	
		
	}
	

}







//implicit call-- compiler has defined the super() keyword inside each constructor and that is calling Parent Default Constructor.

//Explicit Call-- If you want to call parent parameterized constructor you have to write the super() keyword , by which you can call the parent parametized
//constructor.

// this keyword is used to calling a constructor to another within same class.
// super keyword is used to calling parent constructor to child constructor.



