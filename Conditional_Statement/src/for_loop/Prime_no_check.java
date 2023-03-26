package for_loop;

import java.util.Scanner;

public class Prime_no_check {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter any number to check prime or not ");
		int n=sc.nextInt();
		int m=n+1;
		int count=0;
		for (int i=1; i<=m; i++)
		{
			if(n%i==0)
			{
				count ++;
			}
			
		}
		
		if(count ==2)
		{
			System.out.println("You entered a Prime number:- "+n);
		}
		else
		{
			System.out.println(" You entered a Non-Prime number:- "+n);
		}
		
	}
}

