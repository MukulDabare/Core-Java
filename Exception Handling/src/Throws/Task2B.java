package Throws;

public class Task2B  {

	public void m3()
	{
	Task2A a=new Task2A();
	try
	{
		a.m2();
	}
	catch (NullPointerException e)
	{
		e.printStackTrace();
		System.out.println("NullPointerException--catch block");
	}
	//handle this method
	}
}
