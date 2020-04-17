package pkg3;

public class ClassA 
{
	int a;  //global Variable
	
	public void method1()
	{
		System.out.println("Parent Default Method");
	}
	public void method2(int a)
	{
		System.out.println("Parent 1 Parameterized Method");
	}
	public void method3(int a,int b)
	{
		System.out.println("Parent 2 Parameterized Method");
	}
	public void method4(int a,int b,int c)
	{
		System.out.println("Parent 3 Parameterized Method");
	}

}
