package Finally;

public class D {
	
	public int m1()
	{
		int x=10; 
		System.out.println("m1 method");
		try 
		{
			System.out.println("try-block");
			return 10;
		}
		finally
		{
			x=150;
			System.out.println("finally block, x="+x);
			
		}
	}
	
	public static void main(String[] args) {
		
		D d=new D();
		int x=d.m1();
		System.out.println(x);
		
		
	}

}
