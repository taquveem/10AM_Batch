package pkg3;

public class Test 
{
	int a=100;            // global variable default value is 0
	public void method1()
	{
		a=a+1;             // We are incrementing the value of a by 1
	}
	
	public static void main(String[] args) 
	{
		Test obj1=new Test();
		System.out.println("************Object1***********************");
		obj1.method1();
		System.out.println("Value of Object1 is " +obj1.a);    // now value is 113
		obj1.method1();
		System.out.println("Value of Object1 is " +obj1.a);   // now 114
		
		Test obj2=new Test();
		System.out.println("************Object2***********************");
		obj2.method1();
		System.out.println("Value of Object2 is " +obj2.a);
		
		
				
		
	}

}


// Static Keyword 