package Operator_if_else;

import java.util.Scanner;

public class Mix_ladder_nested {

  public static void main(String[] args) {
		
		  
		  System.out.println(" Enter 4 different numbers to find greatest value among them. ");
		  Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=sc.nextInt();
		  int d=sc.nextInt();
		  
		  if((a>b)&&(a>c)&&(a>d))
		       {
			      System.out.println(a+" is greatest among all numbers ");
		       }
		  else if((b>a)&&(b>c)&&(b>d))
		       {
			       System.out.println(b+" is greatest among all numbers ");
		       }
		  else if((c>a)&&(c>b)&&(c>d))
		       {
			       System.out.println(c+" is greatest among all numbers ");
		       }
		  else if ((d>a)&&(d>b)&&(d>c))
		  {
			  System.out.println(d+" is greatest among all numbers ");
		  }
  }
}
