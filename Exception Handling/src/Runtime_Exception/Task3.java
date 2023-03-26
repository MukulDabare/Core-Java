package Runtime_Exception;

import java.util.Scanner;

public class Task3 {
	/*public class Test
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

		}*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s1=sc.next();
		try {
		char c=s1.charAt(6);
		System.out.println(c);
		System.out.println("Enter Number ");
		int n= sc.nextInt();
		System.out.println(s1);
		int x=10/n;
	}
		catch(StringIndexOutOfBoundsException | ArithmeticException e )
		{
			e.printStackTrace();
			System.out.println("Catch block");
		}
		System.out.println("Main ends");
	}

}
