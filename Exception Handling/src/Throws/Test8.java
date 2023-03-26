package Throws;

import java.io.IOException;

public class Test8 {

	public static void main(String[] args) {
		
		System.out.println("main Start");
		
		Task8C c=new Task8C();
		try 
		{
			c.m3();
		} 
		catch (ClassNotFoundException | IOException e) 
		{
			e.printStackTrace();
			System.out.println("catch block");
		}
		System.out.println("main Ends");
	}
}
