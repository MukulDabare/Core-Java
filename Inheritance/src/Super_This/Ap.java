package Super_This;

public class Ap {
	
	public Ap(int i)
	{
		this("ABC");
		System.out.println("A - Constructor - int ");
	}
	public Ap(String i)
	{
		this(14,15);
		System.out.println("A - Constructor - String ");
	}

	public Ap(int i, int j)
	{
		System.out.println("A - Constructor - int, int");
	}


}
