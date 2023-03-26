package Overriding;

public class A {
	
	private int rollno;
	private String name;
	
	public A(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public void m1()
	{
		System.out.println("public--m1--A--Orignal");
	}
	private void m2()
	{
		System.out.println("private--m2--A--Orignal");
	}
	public final void m3()
	{
		System.out.println("public--final--m3--A--Orignal");
	}
	public static void m4()
	{
		System.out.println("public--static--m4--A--Orignal");
	}
	void m5()
	{
		System.out.println("default--A--Orignal");
	}
	protected void m6()
	{
		System.out.println("protected--A--Orignal");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:-"+name+", "+"Rollno:-"+rollno ;
	}

}
