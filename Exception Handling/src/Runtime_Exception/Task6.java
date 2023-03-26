package Runtime_Exception;

public class Task6 {

	/*    class Test
{
main()
{
String s1=args[0];//AAA
SOP(s1.charAt(4));
String s2=args[1];//bb //0
int f1=Integer.parseInt(s2);
int f1=10/f1;

//check which exception will be occured
and handle this exception using try and catch
}
}*/
	public static void main(String[] args) {
		
		try 
		{
			String s1=args[0];
			char c=s1.charAt(0);
			System.out.println(c);
			String s2=args[0];
			int f1=Integer.parseInt(s2);
			int f2=10/f1;
		}
		catch(StringIndexOutOfBoundsException  e)
		{
			e.printStackTrace();
			System.out.println("StringIndexOutOfBoundsException occured ");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException occured");
		}
		
		catch( NumberFormatException e) 
		{
			e.printStackTrace();
			System.out.println("NumberFormatException occured");
		}
		catch( ArithmeticException e) 
		{
			e.printStackTrace();
			System.out.println("Arithmetic Exception occured");
		}
		
		
		
		System.out.println("main ends");
			
		
		
		
	}
}
