package Switch_Case;

import java.util.Scanner;

public class Calci {
	
	public void add(double a, double b)
	{
	  System.out.println("Addition: "+a+" + "+b+" = "+(a+b));
	}
	
	public void sub(double a, double b)
	{
	  System.out.println("Substraction: "+a+" - "+b+" = "+(a-b));
	}
	
	public void multi(double a, double b)
	{
	  System.out.println("Multiplication: "+a+" * "+b+" = "+(a*b));
	}
	
	public void div(double a, double b)
	{
	  System.out.println("Division: "+a+" / "+b+" = "+(a/b));
	}
	
	public static void main(String[] args) {
		
	while(true)
	  {
		Scanner sc=new Scanner(System.in);
		Calci c=new Calci();
		System.out.println("Enter the choice \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division ");
		int choice=sc.nextInt();
	
	  switch(choice)
		{
		case 1:
			System.out.println("Enter a & b for Addition ");
			c.add(sc.nextDouble(), sc.nextDouble());
			break;
		case 2:
			System.out.println("Enter a & b for Substraction ");
			c.sub(sc.nextDouble(), sc.nextDouble());
			break;
		case 3:
			System.out.println("Enter a & b for Multiplication ");
			c.multi(sc.nextDouble(), sc.nextDouble());
			break;
		case 4:
			System.out.println("Enter a & b for Division ");
			c.div(sc.nextDouble(), sc.nextDouble());
			break;
		default:
			System.out.println("Invalid Choice ");
			//System.exit(0);
			
		}
	  }
		
	}

}
