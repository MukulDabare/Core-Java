package String;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String of your choice");
		String s=sc.next();
	    int l=s.length()-1;
	   
	    for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(l);
			System.out.print(c);
			l--;
			
		}
		
   }

}
