package Finally;

public class Task1 {
	
	/*Task 1:add multiple catch and finally
class A
{
main()
{
String s1="ABCD";
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
			String s1="ABCDE";
			System.out.println(s1.charAt(4));
			String s2=null;
			System.out.println(s2.length());
			
		}
		catch(StringIndexOutOfBoundsException | NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Catch block");
		}
		finally 
		{
			System.out.println("finally block");
		}
		System.out.println("main end");
		
		
	}

}
