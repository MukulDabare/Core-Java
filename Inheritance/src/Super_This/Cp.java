package Super_This;

public class Cp extends Bp {
	
	public Cp(char c)
	{
		this('a', 125.52f);
		System.out.println("C - Constructor - char ");	
	}
	public Cp(char c, float f)
	{
		this(15326.254d);
		System.out.println("C - Constructor - char, float ");
	}
	public Cp(double d)
	{
		super('a',2546.256f);
		System.out.println("C - Constructor - double ");	
	}

}
