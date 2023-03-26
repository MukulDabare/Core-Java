package Multithreading;

public class B  {
	String string;

	
	public synchronized void display(String string)
	{
	  for(int i=0; i<string.length();i++)
	  {
		  System.out.println(string.charAt(i)+"-->"+Thread.currentThread().getName());
		  
	  }
	}

}
