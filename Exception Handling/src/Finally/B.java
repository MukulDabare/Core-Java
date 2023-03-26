package Finally;

public class B {
public static void main(String[] args) {
	

	System.out.println("main Start");
	try
	{
		System.out.println("try start");
		int x=10/0;
		System.out.println("try end");
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
		System.out.println("catch block");
	}
	finally
	{
		
		System.out.println("finally block");
	}
}
}