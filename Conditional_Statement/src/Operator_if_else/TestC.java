package Operator_if_else;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		
		
		Calculator c=new Calculator();
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a & b to get Addition:");
		int w=c.addition(sc.nextInt(), sc.nextInt());
		System.out.print("a+b= ");
		System.out.println(w+",");
		
		
		
	    System.out.println("Enter a & b to get Subtraction:");
	    int x=c.subtraction(sc.nextInt(), sc.nextInt());
		System.out.print("a-b= ");
		System.out.println(x+",");
		
		
		
	    System.out.println("Enter a & b to get Multiplication:");
	    int y=c.multiplication(sc.nextInt(), sc.nextInt());
		System.out.print("a*b= ");
		System.out.println(y+",");
		
		
	    System.out.println("Enter a & b to get Division:");
	    double z=c.division(sc.nextDouble(), sc.nextDouble());
		System.out.print("a/b= ");
		System.out.println(z);
			
	}
}
