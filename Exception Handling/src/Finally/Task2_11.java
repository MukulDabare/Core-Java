package Finally;

public class Task2_11 {
	
	/*Task 11: add return statement try and finally
public class Test
{
String m1()
{
try
{
String s1="bbbb";
SOP(s1.charAt(6));
}
finally
{

}
}
main()
{
}
*/
	String m1()
	{
	try
	{
	    String s1="bbbb";
	    System.out.println(s1.charAt(6));
	    return "TryReturn";
	
	}
	finally
	{
		 return "FinallyReturn";
	}
	}
	
	public static void main(String[] args) {
		
		System.out.println("main start");
   		Task2_11 t=new Task2_11();
   		String i=t.m1();
   		System.out.println(i);
   		System.out.println("main end");
	}

}
