package Operator_if_else;

import java.util.Scanner;

public class Calci {

	public double setAddition(double a, double b) 
	{
	 return a+b;	
	}
	public double setSubstraction(double a, double b) 
	{
	 return a-b;	
	}
	public double setMultiplication(double a, double b) 
	{
	 return a*b;	
	}
	public double setDivision(double a, double b) 
	{
	 return a/b;	
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers");
		double a1=sc.nextDouble();
		double a2=sc.nextDouble();
		System.out.println(" Press 1 for Addtiton\n Press 2 for Substraction\n Press 3 for Multiplication\n Press 4 for Division \n ");
		int operation= sc.nextInt();
		
		Calci c=new Calci();
		
		if(operation == 1)
		{
			double w=c.setAddition(a1, a2);
			System.out.println("Addition is:- "+w);
			
		}else if (operation ==2)
		   {
			   double x=c.setSubstraction(a1, a2);
			   System.out.println("Substraction is:- "+x);
			   
		   }else if(operation == 3)
		           {
			         double y=c.setMultiplication(a1, a2);
			         System.out.println("Multiplication  is:- "+y);
			         
		           }else if(operation == 4)
		                   {
			                  double z=c.setDivision(a1, a2);
			                  System.out.println("Division is:- "+z);
			                  
		                   }else 
		                      {
			                      System.out.println("Invalid Input ");
		                      }
		
	}
}

