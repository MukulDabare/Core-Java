package Operator_if_else;

import java.util.Scanner;

public class GreatestNo {
	
	public static void main(String[] args) {
		
		  
		  System.out.println(" Enter any four numbers to find greatest value among them. ");
		  Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=sc.nextInt();
		  int d=sc.nextInt();
		  
		  if(a>b)
		  {
			    if(b>c)
			    {
			    	
			    	    if(c>d)
			    	    {
			    	    	System.out.println(c+" is greatest among all numbers ");
			    	    }
			    	    else
			    	    {
			    	    	System.out.println(d+" is greatest among all numbers ");
			    	    }
			    }else 
			    	if(c>d)
			        {
			    	  System.out.println(c+" is greatest among all numbers ");
			        }
			    	else
			    	{
			    		System.out.println(d+" is greatest among all numbers ");
			    	}
		  }else
			  if(b>c)
			  {
				  if(c>d)
				  {
					System.out.println(c+" is greatest among all numbers ");  
				  }
				  else
				  {
					  System.out.println(d+" is greatest among all numbers ");
				  }
			  }else
				  if(c>d)
				  {
					  System.out.println(c+" is greatest among all numbers ");
				  }
				  else
				  {
					  System.out.println(d+" is greatest among all numbers ");
				  }

 }
}
