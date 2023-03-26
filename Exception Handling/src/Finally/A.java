package Finally;

public class A {
	
	public static void main(String[] args) {
		
		System.out.println("main Start");
		try
		{
			System.out.println("try start");
			int x=10/0;
			System.out.println("try end");
		}
		finally
		{
			
			System.out.println("finally block");
		}
	}

}
