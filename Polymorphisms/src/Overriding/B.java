package Overriding;

public class B extends A{
	public B(int rollno, String name) {
		super(rollno, name);
		
	}
	@Override
	public void m1()
	{
		System.out.println("public--m1--B--Overrided");
	}
	private void m2()
	{
		System.out.println("private--m2--B--can not override methode \nbut can be written as it is from parent class A.\n");
	}
//  Can't Override Final method
//	public final void m3()
//	{
//		System.out.println("public--final--m3--B--Can not be written in child class");
//	}
	public static void m4()
	{
		
		System.out.println("public--static--B--m4--Written as it is from parent class");
	}
	@Override
	void m5()
	{
		this.m2();
		System.out.println("default--B--Overrided");
	}
	@Override
	protected void m6()
	{
		System.out.println("protected--B--Overrided");
	}
	

	
}
