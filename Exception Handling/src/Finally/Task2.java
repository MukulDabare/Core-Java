package Finally;

import java.util.Scanner;

public class Task2 {
	/*Task 2: add multiple catch and finally block
public class Test
{
main()
{
get the value from User using Scanner class
Scanner sc=new Scanner(System.in);
String s1=sc.next();
SOP(s1.charAt(6));
int n=sc.nextInt();//put Zero first
SOP(s1)
int x=10/n;
}
}
}
*/
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=sc.next();
		try
		{
			System.out.println("Your String:-"+s1);
			System.out.println(s1.charAt(6));
			System.out.println("Enter Number");
			int n=sc.nextInt();
			int x=10/n;
		}
		catch(StringIndexOutOfBoundsException | ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally block");
		}

		
		
		
		
	}
	

}
