package Static;

public class A3 {

	static void staticMethod()
	{
		System.out.println("Class A");
	}
	
	static
	{
		System.out.println("A-Static block");
	}
	{
		System.out.println("A-non-static block");
	}

	public A3()
	{
		System.out.println("Constructor--A");
	}
}
