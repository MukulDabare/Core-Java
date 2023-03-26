package Finally;

public class Task4 {
	/*Task 4:
class Test
{
main()
{
			
String s1=args[0];

SOP(s1.charAt(0));
String s2=null;
SOP(s2.length());
int x=10/s1;

//check which exception will be occured
and handle this exception using try and catch
}
}
*/
	
	public static void main(String[] args) {
		
		try
		{
			String s1=args[0];
			System.out.println(s1.charAt(0));
			String s2=null;
			System.out.println(s2.length());
			int y=Integer.parseInt(s1);
			int x=10/y;
			System.out.println(x);
		}
		catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException |NullPointerException | NumberFormatException | ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Catch block");
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("main ends ");
		
		
	}

}
