package Runtime_Exception;

public class A {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try
		{
			System.out.println("try starts");
			int x=10/0;
			System.out.println("try ends");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch Block");
		}
		
		System.out.println("Main Ends");
	}

}
