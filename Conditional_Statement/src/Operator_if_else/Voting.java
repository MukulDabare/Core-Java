package Operator_if_else;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your Age ");
		int age =sc.nextInt();
		int cage= age;
		int kid = 18-age;
	 
		
		if((age>=18)&&(age<=70))
		{
			System.out.println("Your are eligible for voting.");
		}
		else if (cage>=70)
		     {
			
			        System.out.println(" You excide age limit. Your not eligible for voting. Take rest. Have a nice day. ");
		     }
		     else {
		    	     
		    	     System.out.println(" Hey kid your not eligible come after "+(kid)+" years for voting.");
		     }
		
	}
}
