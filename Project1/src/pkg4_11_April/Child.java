package pkg4_11_April;

public class Child extends Parent
{
	public void arithmatic(int x1,int x2)
	{
		int x3;
		x3=x1+x2;
		System.out.println("Inside child class sum is " +x3);
	}
	
	public static void main(String[] args) 
	{
		Child C=new Child();
		C.arithmatic(10, 20);
		
	}

	
}




//There are two possibilites in case of inheritance
//
//1) with the help of child object we can call the parent methods.
//2) child class can override the parent method.

//dynamic polymorphism will happen in case of inheritance

//method names-----------same
//method inputs-----------same
//method output-----------same
//but functionality/implementation/body will be different.


//if you try to change this return type in int then it shows error which is The return type is incompatible with Parent.arithmatic. 