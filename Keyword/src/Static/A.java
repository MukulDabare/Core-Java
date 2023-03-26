package Static;

public class A {
	
	int rollno;
	static String name;
	
	public static void m1()
	{
		System.out.println("Method Outputs:");
		System.out.println(name);
		A a=new A();
		System.out.println(a.rollno);
		System.out.println(a.name);
		System.out.println(A.name+"\n");
	}

}
