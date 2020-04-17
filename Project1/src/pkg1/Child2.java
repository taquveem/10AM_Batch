package pkg1;

public class Child2 extends Parents
{
	public void method3()
	{
		System.out.println("I am the second child");
	}
	
	public static void main(String[] args) 
	{
		Child2 ref=new Child2();
		ref.method3();
		ref.method1();
	
		
		
	}


}

// Hierarchical Inheritance