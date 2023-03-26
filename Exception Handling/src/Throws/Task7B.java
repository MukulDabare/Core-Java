package Throws;

import java.util.Scanner;

public class Task7B {
	
	
	void m2()throws ArithmeticException
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Number");
	  int x=sc.nextInt();
	  int i=10/x;
	  System.out.println(i);
	}

}
