package String;

import java.util.Scanner;

public class Palindrome_Number_check {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome or not");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int rem=0;
		
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("You Entered a Palindrome Number");
		}
		else
		{
			System.out.println("This is not a Palindrome  Number");
		}
	}

}
