package Runtime_Exception;

public class Task1 {
	
	/* Task 1:
class A
{
main()
{
String s1="ABCD";
SOP(s1.charAt(4));
//check which exception will be occured
and handle this exception using try and catch
}
}
*/
   public static void main(String[] args) {
	   
	   System.out.println("main starts");
	   String s1="ABCD";
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
	  
	 System.out.println("main ends");
		


}
}
