package Runtime_Exception;

public class B {
	
	public static void main(String[] args) {
		try 
		{
		   String s=args[0];
		   int x=Integer.parseInt(s);
		   int a=10/x;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter input value");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter non-zero value"); 
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter number");
		}
	

	}
}
