package Array;

import java.util.Scanner;

public class Customer_with_scanner {
	
	public static void main(String[] args) {
		
		System.out.println("Emter No.of Customer");
		Scanner sc=new Scanner(System.in);
		
		Customer cus[]=new Customer[sc.nextInt()];
		
		for(int i=0; i<cus.length; i++)
		{
			Customer c=new Customer();
			System.out.println("Enter Customer Name and Id resp.");
			c.setCname(sc.next());
			c.setCid(sc.nextInt());
			cus[i]=c;
			
		}
		
		for(int i=0; i<cus.length; i++)
		{
			System.out.println("Customer Name:- "+cus[i].getCname());
			System.out.println("Customer Id:- "+cus[i].getCid());
		}
	}

}
