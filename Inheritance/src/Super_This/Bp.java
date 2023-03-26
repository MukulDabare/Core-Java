package Super_This;

public class Bp extends Ap {
	
	public Bp()
	{
		super(152);
		System.out.println("B - Constructor - non ");	
	}
	public Bp(long l)
	{
		this(true);
		System.out.println("B - Constructor - long ");
	}
	public Bp(boolean b)
	{
		this();
		System.out.println("B - Constructor - boolean ");	
	}
	public Bp(char c, float f)
	{
		this(15235l);
		System.out.println("B - Constructor - char, float ");	
	}
	

}
