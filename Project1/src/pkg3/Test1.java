package pkg3;

import java.sql.Ref;

public class Test1 
{
	static int a=100;             // global variable default value is 0 //after call obj1 value is 102
	
	public void method1()
	{
		a=a+1;             // We are incrementing the value of a by 1
	}
	
	public static void main(String[] args) 
	{
		System.out.println("************Object1***********************");
		Test1 obj1=new Test1();
		obj1.method1();
		System.out.println("Value of object1 " +obj1.a);    // now value of a is 101 which is stored in class level
		obj1.method1();
		System.out.println("Value of object1 " +obj1.a);    // now value of a is 102 which is stored in class level
		
		System.out.println("************Object2**********************");
		Test1 obj2=new Test1();
		obj2.method1();
		System.out.println("Value of object2 " +obj2.a);    // now value of a is 103 which is stored in class level
		
		
		System.out.println("************Object3**********************");
		Test1 obj3=new Test1();
		obj3.method1();
		System.out.println("Value of object3 " +obj3.a);    // now value of a is 104 which is stored in class level
		
		
		System.out.println("************Object1***********************");
//		obj1.method1();
		System.out.println("Value of object1 " +obj1.a);    // now value of a is 102 which is stored in class level
		
		
	}

}
//Static Variable