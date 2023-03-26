package Static;

public class B3 extends A3 {
	
	static void staticMethod()
	{
		System.out.println("Class B");
	}
	
	static
	{
		System.out.println("B--Static block");
	}
	{
		System.out.println("B-non-static block");
	}
	public B3()
	{
		System.out.println("Constructor---B");
	}

}
