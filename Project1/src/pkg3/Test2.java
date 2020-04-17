package pkg3;

public class Test2 
{
	static int golu=100;
	
	public static void method1()
	{
		golu=golu+1;
		System.out.println("I am a static method");
	}
	
	public static void main(String[] args) 
	{
		Test2.method1(); //There is no need to object creation you can call directly by class name.
		System.out.println("Value of golu is " +Test2.golu);
		golu=golu+1;
	}
	

}

//Static method