package Throws;

import java.io.IOException;

public class Demo {
	
	public void m1() throws Exception
	{
		
		try 
		{
		   B3 b = new B3();
			b.m1();
			b.m2();
			b.m3();
			b.m4();
			b.m5();
			B3 b1=new B3(2);
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		Demo d=new Demo();
		try 
		{
			d.m1();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	


}
