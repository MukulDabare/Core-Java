package SingleLevel_Inheritance;

public class Test1 {
	public static void main(String[] args) {
		
		A1 a1=new A1();//1
		a1.m1();
		a1.m2();
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println("---------------------------");
		
		B2 b2=new B2();
		b2.m1();
		b2.m2();
		b2.m3();
		b2.m4();
		b2.m5();
		
		System.out.println(b2.a);
		System.out.println(b2.b);
		System.out.println(b2.c);
		System.out.println("---------------------------");
		
		
		A1 a=new B1();
		a.m1();
		a.m2();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println("---------------------------");
		
	}

}
