package Runtime_Exception;

public class Task5 {
	
	    /*Task 5:
class Test
{
main()
{
			
String s1=args[0];

SOP(s1.charAt(0));
String s2=null;
SOP(s2.length());
//check which exception will be occurred
and handle this exception using try and catch
}
}
*/
	public static void main(String[] args) {
		
		String s1=args[0];
		try
		{
			char c=s1.charAt(0);
			System.out.println(c);
			String s2=null;
			int l=s2.length();
			System.out.println(l);
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Catch block");
			
		}
		System.out.println("main ends");
		
		
		
	}

}
