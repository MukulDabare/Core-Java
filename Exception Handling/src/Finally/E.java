package Finally;

public class E {
	public int m1()
	{
		int x=10; 
		System.out.println("m1 method called");
		try 
		{
			System.out.println("try-block");
			return 10;
		}
		finally
		{
			x=150;
			System.out.println("finally block, x="+x);
			return x;
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main starts");
		E e=new E();
		int x=e.m1();
		System.out.println(x);
		System.out.println("main ends");
		
		
	}

}
