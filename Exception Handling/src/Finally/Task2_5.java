package Finally;

public class Task2_5 {
	/*Task 5:
public class Test
{
String m1(String s2)
{

String s1="abc";
try{
sop(s1.charAt(6));
return s1;
}
finally()
{
return s2;
}
}
main()
{
call m1 method
}
}
*/
	String m1(String s2)
	{

	String s1="abc";
	try{
	System.out.println(s1.charAt(6));
	return s1;
	}
	finally
	{
	  return s2;
	}
	
	}
	public static void main(String[] args) {
		
		System.out.println("main start");
		Task2_5 t=new Task2_5();
		String i=t.m1("xyzj");
		System.out.println(i);
		System.out.println("main end");
	}
	
	

}
