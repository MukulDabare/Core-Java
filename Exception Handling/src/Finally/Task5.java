package Finally;

public class Task5 {
	
	/* {

String s1=args[0];//AAA
SOP(s1.charAt(4));
String s2=args[1];//bb //0
int f1=Integer.parseInt(s2);
int f1=10/f1;

//check which exception will be occured
and handle this exception using try and catch
}
}
*/
	
	public static void main(String[] args) {
		
		try
		{
			String s1=args[0];
			System.out.println(s1.charAt(1));
			String s2=args[1];
			int f1=Integer.parseInt(s2);
			int f2=10/f1;
		}
		catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException | NumberFormatException | ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Catch block");
			
		}
		finally 
		{
			System.out.println("Finally block");
		}
		
	}

}
