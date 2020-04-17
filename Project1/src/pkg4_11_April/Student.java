//****************Static Polymorphism******************************

package pkg4_11_April;

public class Student 
{
	public  int sum(int a, int b)                //2 Intetger input, Method name=sum
	{
		int c;
		c=a+b;
		return c;
	}
	
	public void sum(int a,float b)           // Method name will same but method input will not same
	{                                            // Method name= sum
		float c;                                   // One integer and one folat also possible
		c=a+b;
		System.out.println("Result of the second method is " +c);                	
	}
	
	public void sum(int a,int b,int c)
	{
		int d;
		d=a+b+c;
		System.out.println("Result of the third method is " +d);
	}
public static void main(String[] args) 
{
	Student s=new Student();
	int sum_result=s.sum(33, 12);
	System.out.println("Result of the first method is " +sum_result);
	s.sum(10, 20F);
	s.sum(11, 22, 33);
}

}



//Method Overloading/Static Polymorphism/CompileTIme Polymorphism

//method names-----------same
//method inputs-----------can't be same
//method output-----------can be same or can't be same
