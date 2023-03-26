package Super_This;

public class B1t extends A1t {
	
	public B1t()
	{
		this("Star");
		System.out.println("B-Default Consturctor");
	}
	public B1t(int i)
	{
		System.out.println("B-int-Constructor");
	}
	public B1t(String s)
	{
		this(5);
		System.out.println("B-String-Constructor");
	}

}
