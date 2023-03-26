package Operator_if_else;

import java.util.Scanner;

public class Even_odd {
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("You entered a Even number ");
		}
		else
		{
			System.out.println("You entered a Odd number");
		}
		
	}

}
