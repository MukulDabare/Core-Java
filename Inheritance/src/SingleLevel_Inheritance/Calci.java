package SingleLevel_Inheritance;

import java.util.Scanner;

public class Calci {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter choice:- \n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Divison");
		int choice=sc.nextInt();
		System.out.println("Enter A and B");
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		B b=new B();
		switch(choice)
		{
		case 1:
			System.out.println("Addition :- "+b.add(c, d));
			break;
		case 2:
			System.out.println("Substraction:- "+b.sub(c, d) );
			break;
		case 3:
			System.out.println("Multiplication:- "+b.multi(c, d));
		case 4:
			System.out.println("Division:- "+b.div(c, d));
			break;
		default:
			System.out.println("Invalid choice ");
			
		}
		
		
		
		
		
		
		
		
	}

}
