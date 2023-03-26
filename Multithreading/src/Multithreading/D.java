package Multithreading;

public class D {

	public synchronized void display(char str, char end)
	{
		for(char i=str; i<=end; i++)
		{
			System.out.println(i+"   "+ Thread.currentThread().getName());
		}
	}
}
