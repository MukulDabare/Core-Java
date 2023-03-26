package Runtime_Exception;

public class Task2 {
	/* Task 2:
class Test
{
main()
{
String s2=null;
SOP(s2.length());
//check which exception will be occured
and handle this exception using try and catch
}
}
*/
	
	public static void main(String[] args) {
		 System.out.println("main starts");
		String s2=null;
		try
		{
		int i=(s2.length());
		System.out.println(i);

	    }
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Catch block");
		}
		System.out.println("main ends");
}
}
