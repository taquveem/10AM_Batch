package Assignment5;

public class Student 
{
	public static void method1()
	{
		System.out.println("I am Parent Default method");
	}
	public static void main(String[] args) 
	{
		Student S=new Student();
		Student.method1();
		method1();
		S.method1();
		
		
	}

}
