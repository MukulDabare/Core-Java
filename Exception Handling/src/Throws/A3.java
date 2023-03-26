package Throws;

import java.io.IOException;

public class A3 {
	//Demo class for testing 
	
	public void m1()
	{
		System.out.println("A--m1--without Exception");
	}
	public void m2()throws IOException
	{
		System.out.println("A--m2--with Exception");
	}
	public void m3()throws IOException
	{
		System.out.println("A--m3--with Exception");
	}
	public void m4()throws IOException
	{
		System.out.println("A--m4--with Exception");
	}
	public void m5()throws IOException
	{
		System.out.println("A--m5--with Exception");
	}
	public A3()
	{
		System.out.println("A--Constructor--without Exception");
	}
	public A3(int i)throws IOException
	{
		this();
		System.out.println("A--Constructor--with Exception");
	}
	

}
