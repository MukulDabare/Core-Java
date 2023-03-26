package Overloading;

public class B {
	int i;
	String s;
	char c;
	float f;
	public B(int i)
	{
		this(154.254f);
		this.i=i;
		System.out.println("Consturctor--B--int");
	}
	public B(String s)
	{
		this.s=s;
		System.out.println("Consturctor--B--String");
	}
	private B(char c)
	{
		this.c=c;
		System.out.println("Consturctor--B--char");
	}
	public B(float f)
	{
		this('a');
		this.f=f;
		System.out.println("Consturctor--B--float");
	}
	public B(Object o)
	{
		System.out.println("Consturctor--B--Object");
	}

}
