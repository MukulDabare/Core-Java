package Throws;

public class Test9 {
	
	public static void main(String[] args) {
		System.out.println("main Start ");
		Task9C c=new Task9C();
		try
		{
			c.m3();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("ArithmeticException---Catch block");
		}
		
		System.out.println("main ends ");
		
	}

}
