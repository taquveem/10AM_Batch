package pkg4_11_April;

public class Zswift extends Zcar  // to provide the body to the abstract method of Zcar class
{
	public void golu()
	{
		System.out.println("body given by child class to Zcar golu method ");
	}
	
	public void xyz()
	{
		System.out.println("body given by child class to Zcar xyz method");
	}
	
	public static void main(String[] args) 
	{
		Zswift S=new Zswift();
		S.abc();
		S.golu();
		S.xyz();
		
	}
	

}
