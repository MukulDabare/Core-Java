package Finally;

public class Task2_15 {

	private String[] args;
	/*Task 15: add multiple catch and finally block with return value
 each catch block you have to add return statment
class Test
{
char data()
{
String s1=args[0];//BBBB
SOP(s1.charAt(4));
String s2=null;
SOP(s2.length());
//check which exception will be occured
and handle this exception using try and catch
}
main()
{
}
}
*/
	char data()
	{
	    	String s1="BBBB";//BBBB
	
		try
		{
			System.out.println(s1.charAt(3));
			String s2=null;
			System.out.println(s2.length());
			return 't';
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("StringIndexOutOfBoundsException ");
			return 'a';
			
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("NullPointerException ");
			return 'b';
		}
		finally 
		{
			System.out.println("finally block");
			return 'f';
		}
	}
	public static void main(String[] args) {
		
		System.out.println("main start");
   		Task2_15 t=new Task2_15();
   		char i=t.data();
   		System.out.println(i);
   		System.out.println("main end");
		
		
	}
	
}
