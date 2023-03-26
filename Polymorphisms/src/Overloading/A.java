package Overloading;

public class A {
	
	public void m1()
	{
		System.out.println("m1---A");
	}
	public void m1(char c)
	{
		System.out.println("m1---char");
	}
	
	private void m2(int i)
	{
		System.out.println("m2---int--private");
	}
	private void m2(char c)
	{
		System.out.println("m2---char--private");
	}
	public final void m3(String s)
	{
		this.m2(15);
		this.m2('a');
		System.out.println("m3---String---final");
	}
	public final void m3(char c)
	{
		System.out.println("m3---char--final");
	}

	
}
