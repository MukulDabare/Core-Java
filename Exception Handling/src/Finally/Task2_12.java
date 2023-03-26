package Finally;

import java.util.Scanner;

public class Task2_12 {
	/*Task 12: add return statment try catch and finally also
class Test
{
int aa()
{
try{
//take value frome scanner
String s1=sx.next();
s1.chartAt(8);
}
catch()
{
}
finally
{
SOP(finally block);
}
}
main()
{
}
}
*/
	int aa()
	{
	try{
		
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter String");
	     String s1=sc.next();
	     s1.charAt(8);
	     return 586;
	}
	catch(StringIndexOutOfBoundsException e)
	{
		e.printStackTrace();
		System.out.println("catch block");
		return 12;
	}
	finally
	{
		System.out.println("finally block");
		return 154;
	
	}
	}
	
	public static void main(String[] args) {
		
		System.out.println("main start");
   		Task2_12 t=new Task2_12();
   		int i=t.aa();
   		System.out.println(i);
   		System.out.println("main end");
	}

}
