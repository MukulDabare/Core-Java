package Throws;

import java.io.FileNotFoundException;
import java.io.IOException;

public class B3 extends A3 {
	//Demo class for testing 
	
//	public void m1() throws Exception
//	{
//		//we can not right m1 with throw in child class
//	}
	@Override
	public void m2()  
	{
		System.out.println("B--m2--without Exception");

	}
	
	@Override
	public void m3()throws IOException 
	{
		System.out.println("B--m3--with Exception");
	}
	
	@Override
	public void m4() throws FileNotFoundException 
	{
		System.out.println("B--m4--with Exception");
	}
	
	
//	public void m5() throws Exception 
//	{
//		//we can not write throw of parent class exception while overriding method in child class. 
	    
//	}
	
	public B3()throws IOException
	{
		System.out.println("B--Constructor--with Exception");
        //it is completely our choice whether to write throws keyword or not 
	}
	public B3(int i) throws Exception
	{
		super(1);
		System.out.println("B--Constructor--without Exception");

	}

	
}
