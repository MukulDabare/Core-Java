package Overloading;

public class C {
	int i;
	String s;
	Object o;
	
	public void m1()
	{
		System.out.println("m1--C--default--method");
	}
	public void m1(int i)
	{
		System.out.println("m1--C--int--method");
	}
	public void m1(Object o)
	{
		System.out.println("m1--C--Object--method");
	}
	public void m1(String s)
	{
		System.out.println("m1--C--String--method");
	}
	
	public C()
	{
		System.out.println("C--Constructor--default");
	}
	public C(String s)
	{
		this.s=s;
		System.out.println("C--Constructor--String");
	}
	public C(Object o)
	{
		this.o=o;
		System.out.println("C--Constructor--Object");
	}

}
