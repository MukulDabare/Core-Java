package Throws;

import java.io.IOException;

public class A1 {
	
	public void m1()
	{
		System.out.println("m1-Start");
		B1 b=new B1();
		b.m2();
		System.out.println("m1-Ends");
	}
	public static void main(String[] args) {
		
		System.out.println("main--Starts");
		A1 a=new A1();
		try 
		{
			a.m1();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("ArithmeticException");
		}
	
	
		System.out.println("main--Ends");
	}

}
