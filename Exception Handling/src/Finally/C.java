package Finally;

public class C {
	
	public int m1()
	{
		System.out.println("m1");
		if (true)
		 return 10;
		System.out.println("hello");
		return 20;
	}
	public static void main(String[] args) {
		
		C c=new C();
		int x=c.m1();
		System.out.println(x);
	}

}
