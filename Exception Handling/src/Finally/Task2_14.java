package Finally;

import java.util.Scanner;

public class Task2_14 {
	
	/*Task 14: add multiple catch and finally block with return value
 each catch block you have to add return statment
public class Test
{
int m1()
{
get the value from User using Scanner class
Scanner sc=new Scanner(System.in);
String s1=sc.next();
SOP(s1.charAt(6));
int n=sc.nextInt();//put Zero first
SOP(s1)
int x=10/n;
}
main()
{
}
}
}
*/
	
	int m1()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String ");
			String s1=sc.next();
			System.out.println(s1.charAt(6));
			System.out.println("Enter Number");
			int n=sc.nextInt();//put Zero first
			System.out.println(s1);
			
			int x=10/n;	
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("StringIndexOutOfBoundsException");
			return 10;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("ArithmeticException");
			return 20;
		}
		finally
		{
			System.out.println("finally block");
			return 30;
		}
	
	
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
   		Task2_14 t=new Task2_14();
   		int  i=t.m1();
   		System.out.println(i);
   		System.out.println("main end");
	}

}
