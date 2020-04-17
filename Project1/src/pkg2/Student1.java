package pkg2;

public class Student1 
{
	public void method2()
	{
		System.out.println("I am a method2");
	}
	public static void main(String[] args) 
	{
		Student ref=new Student();
		ref.method1();
		
		Student1 obj=new Student1();
		obj.method2();
		
	}
	

}

//we can not call method2 because there is no relation ship b/w Student & Student1 class.
//has a relationship