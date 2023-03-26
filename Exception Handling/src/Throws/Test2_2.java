package Throws;

import java.io.FileNotFoundException;

public class Test2_2 {

	public static void main(String[] args) {
		
		System.out.println("Main start");
		
		Task2A2 t=new Task2A2();
		try 
		{
			t.display();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
			System.out.println("ClassNotFoundException--Catch block");
		}
		System.out.println("Main end");
	}
}
