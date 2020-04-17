package pkg3;

public class ClassB extends ClassA
{
	public void method5()
	{
		System.out.println("Child Default Method"); 
//		super.a=100;
//		System.out.println("Value of a " + super.a);
//		super.method1();
	}
	public void method6(int a)
	{
		System.out.println("Child 1 Parametrized Method");
		
	}
	public void method7(int a,int b)
	{
		super.method4(11, 22, 33);
		super.method1();
		super.method2(11);
		super.method3(11, 22);
		this.method9(11, 22, 33, 44);
		this.method5();
		this.method6(11);
		System.out.println("Child 2 Parametrized Method");
		
	}
	public void method8(int a,int b,int c)
	{
		System.out.println("Child 3 Parametrized Method");
		
	}
	public void method9(int a,int b,int c,int d)
	{
		System.out.println("Child 4 Parametrized Method");
		
	}
		
	public static void main(String[] args) 
	{
		ClassB ref=new ClassB();
		ref.method7(11, 22);
		
	}

}

//super keyword with method