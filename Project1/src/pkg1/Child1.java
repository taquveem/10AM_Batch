package pkg1;

public class Child1 extends Parents 
{
	public void method2()
	{
		System.out.println("I am the first child");
	}
	
	public static void main(String[] args) 
	{
		Child1 ref=new Child1();
		ref.method2();
		ref.method1();
	
		
		
	}

}

//Hierarchical Inheritance