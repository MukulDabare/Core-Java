package Throw;

public class A {
	
	public void m1()
	{
		System.out.println("m1 Start");
		int x=10/0;
		System.out.println("m1 end");
	}
	public static void main(String[] args) {
		
		System.out.println("main Start");
		A a=new A();
		try {
			a.m1();
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("catch block---"+e.getMessage());
		}
		
		System.out.println("main end");
	}

}
