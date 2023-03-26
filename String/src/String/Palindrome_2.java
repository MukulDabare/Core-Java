package String;

import java.util.Scanner;

public class Palindrome_2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word or Number to check Palindrome or not");
		String s1=sc.next();
		String s=s1.toLowerCase();
		
		String n="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			n=n+s.charAt(i);
			
		}
		if(n.equals(s))
		{
			System.out.println("You entered a Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
