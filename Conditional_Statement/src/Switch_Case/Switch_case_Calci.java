package Switch_Case;

import java.util.Scanner;

public class Switch_case_Calci {
	
	public static void main(String[] args) {
		System.out.println("Enter value for A ");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		System.out.println("Enter value for B ");
		double b=sc.nextDouble();
		
		System.out.println(" Press 1 for Addtiton\n Press 2 for Substraction\n Press 3 for Multiplication\n Press 4 for Division \n ");
		int operation= sc.nextInt();
		
		switch(operation)
		{
		case 1:
			System.out.println("Addition:- "+(a+b));
			break;
		
		case 2:
			System.out.println("Substraction:- "+(a-b));
			break;
		
		case 3:
			System.out.println("Multiplication:- "+(a*b));
			break;
		
		case 4:
			System.out.println("Division:- "+(a/b));
			break;	
		
		default:

			System.out.println("Enter valid Operation");
			System.exit(0);
		}
	}

}
