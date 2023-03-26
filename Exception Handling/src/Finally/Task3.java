package Finally;

public class Task3 {
	/*Task 3:add multiple catch and finally block
class Test
{
main()
{
String s1=args[0];//BBB
SOP(s1.charAt(4));
String s2=null;
SOP(s2.length());
//check which exception will be occured
and handle this exception using try and catch
}
}
*/
	public static void main(String[] args) {
		System.out.println("main start");
		try
		{
			String s1=args[0];
			System.out.println(s1.charAt(2));
			String s2=null;
			System.out.println(s2.length());
		}
		catch(StringIndexOutOfBoundsException | NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("main end");
		
	}

}
