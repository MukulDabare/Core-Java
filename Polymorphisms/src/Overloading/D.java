package Overloading;

public class D extends C {
	
	public D(Object o)
	{
		System.out.println("D--Constructor--default");
	}
	public D(String s)
	{
		System.out.println("D--Constructor--String");
	}
	public D(C c)
	{
		System.out.println("D--Constructor--C type");
	}
	
	

}
