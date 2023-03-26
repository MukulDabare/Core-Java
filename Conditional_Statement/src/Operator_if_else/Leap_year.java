package Operator_if_else;

import java.util.Scanner;

public class Leap_year {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter any year to check whether year is leap or not ");
		
		int year=sc.nextInt();
		
		if(year%4==0 || year%400==0 || year%100==0) {
			System.out.println(" You Entered a Leap Year :- "+year);
		}
		else {
			System.out.println(" This is not a Leap Year:- "+year);
		}
	}

}
