package pkg1;

public class Third extends Second
{
	public void method3()
	{
		System.out.println("I am a child method");
	}
	
	public static void main(String[] args) 
	{
		Third ref=new Third();
		ref.method3();
		ref.method2();
		ref.method1();
		
	}

	

}


//Multi level inheritance