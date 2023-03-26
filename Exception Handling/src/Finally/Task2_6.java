package Finally;

public class Task2_6 {
	
	/*Task 6:
public class Test
{
String m1(Strning s1,String s2)
{
try{
SOP(s1.charAt(10));
return s1;
}
catch()
{
return s2;
}
finally
{

}
}
main()
{
call m1 method
}
}
*/
	String m1(String s1,String s2)
	{
	try{
		System.out.println(s1.charAt(10));
	    return s1;
	   }
	catch(StringIndexOutOfBoundsException e)
	  {
		 e.printStackTrace();
		 System.out.println("catch block");
	     return s2;
	  }
	finally
	{
       System.out.println("finally block");
	}
	}
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		Task2_6 t=new Task2_6();
		String i=t.m1("xyzj","ADNjhdkun");
		System.out.println(i);
		System.out.println("main end");
	}
	
	

}
