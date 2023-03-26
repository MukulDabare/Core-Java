package Finally;

public class Task2_13 {
	
	/*Task 13:add multiple catch and return the String value
class A
{
String m1()
{
String s1="ABCD";
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
	String m1()
	{
		String s1="ABCD";
		try
		{
			
			System.out.println(s1.charAt(4));
			String s2=null;
			System.out.println(s2.length());
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("StringIndexOutOfBoundsException");
			return s1;
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("NullPointerException");
			return s1;
			
		}
		return s1;
	
	
	
	}
	public static void main(String[] args) {
		System.out.println("main start");
   		Task2_13 t=new Task2_13();
   		String  i=t.m1();
   		System.out.println(i);
   		System.out.println("main end");
	}
	
	

}
