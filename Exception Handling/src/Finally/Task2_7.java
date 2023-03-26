package Finally;

public class Task2_7 {
	
	/*Task 7:
public class Test
{
String m1(Strning s1,String s2,return s3)
{
try{
int a=10/2;
return s1;
}
catch()
{
return s2;
}
finally
{
return s3;
}
}
main()
{
call m1 method
}
}
*/
	String m1(String s1,String s2,String s3)
	{
	try{
	     int a=10/2;
	     return s1;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("catch block");
	 return s2;
	}
	finally
	{
	 return s3;
	}
	}
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		Task2_7 t=new Task2_7();
		String i=t.m1("TryReturn","CatchReturn", "FinallyReturn");
		System.out.println(i);
		System.out.println("main end");
	}
	

}
