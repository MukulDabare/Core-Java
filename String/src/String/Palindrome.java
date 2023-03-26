package String;

import java.util.Scanner;

public class Palindrome {
	
	public void palindrome(String s)
	{
		String s3=s.toLowerCase();
		
		int l2=s3.length()-1;
		
		int l=(l2)/2;
		//System.out.println(l);
		int count=0;
		if(l2%2!=0)
		{
			l=l+1;
		}
		for(int i=0; i<l; i++)	
		{
			for (int j=l2;j>l;j--)
			{
				if(s3.charAt(i)==s3.charAt(j))
				{
					count++;
				}
				
			}
		}
		//System.out.println(count);
		if (count ==l)
		{
			System.out.println("You Entered a Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word to check palindrome or not");
		String s=sc.next();
		Palindrome p=new Palindrome();
		p.palindrome(s);
		
		
	}

}
