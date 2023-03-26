package Operator_if_else;

import java.util.Scanner;

public class ladder {

	
public static void main(String[] args) {
	
	System.out.println("Enter any Number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	if(a>0)
	{
		System.out.println("Number is positive");
	}
	else if(a<0)
	{
		System.out.println("Number is negative");
		
	}
	else
	{
		System.out.println("Number is neutral or zero");
	}
	
	System.out.println("Enter your name ");
	String s=sc.next();
	System.out.println(s);
}
}
