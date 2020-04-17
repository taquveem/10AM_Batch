package pkg1;

public class Golu extends Student   // Golu is child class & Student is Parent class
{
	public void method()
	{
		System.out.println("I am a child class");
	}
	
	public static void main(String[] args) 
	{
		Golu ref=new Golu();
		ref.method();
		ref.method1();
		ref.method2();
		ref.age=28;
		System.out.println("Value of age is " + ref.age);
		ref.roll_no=0;
		System.out.println("Valoue of roll_no is " + ref.roll_no);
			
	}
		
	
}


//With the help of child class object we can call child+ parent method & child+parent class variable.
//Single level Inheritance
