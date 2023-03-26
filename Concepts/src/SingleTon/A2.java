package SingleTon;

public class A2 {
	//this approach will create object of A2 only if request is generated.
	private static A2 a = null;
	
	private A2()
	{
		
	}
	
	public static A2 getA2()
	{
		if(a==null)
		{
			a=new A2();
		}
		
		return a;
	}

}
