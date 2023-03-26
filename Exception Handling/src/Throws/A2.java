package Throws;

import java.io.IOException;

public class A2 {
	
	public void m1()
	{
		System.out.println("m1--Starts");
		B2 b=new B2();
		try 
		{
			b.m2();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.out.println("catch block");
				
		}
		System.out.println("m1-Ends");
		
	}
	public static void main(String[] args) {
		
		System.out.println("main--Starts");
		A2 a=new A2();
		a.m1();
		System.out.println("main--Ends");
	}
	

}
