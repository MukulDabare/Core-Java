package Runtime_Exception;

public class Task4 {
	
	/*class Test
{
main()
{
String s1=args[0];//BBB
SOP(s1.charAt(4));
//check which exception will be occured
and handle this exception using try and catch
}
}*/

	public static void main(String[] args) {
		
		String s1=args[0];
		try 
		{
			 char c=s1.charAt(4);
			 System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Catch block");
		}
			System.out.println("Main ends");
		}
	

}

