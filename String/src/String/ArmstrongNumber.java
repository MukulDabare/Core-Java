package String;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		//153=(1*1*1)+(5*5*5)+(3*3*3)=153
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check armstrong number or not");
		
		int n=sc.nextInt();
		int temp=n;
		int rem=0;
		int arm=0;
		
		while(n>0)
		{
			rem =n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if (temp==arm)
		{
			System.out.println("Its a Armstrong Number");
		}
		else
		{
			System.out.println("Its not a Armstrong Number");
		}
	}

}
