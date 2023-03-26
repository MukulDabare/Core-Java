package Throws;

public class Task3C {
	
 public void m3()
  {
	 System.out.println("m3--C--Start");
	  Task3B b=new Task3B();
	  //handle exception
	try 
	{
		b.m2();
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
		System.out.println("catch block");
	}
	System.out.println("m3--C--Ends(No exception)");

  }

}
