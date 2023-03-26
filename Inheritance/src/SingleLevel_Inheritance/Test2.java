package SingleLevel_Inheritance;

public class Test2 {
	
	public static void main(String[] args) {
		
		A2 a2=new A2();//1
		a2.m1();
		a2.m2();
		a2.m3();
		System.out.println(a2.a);
		System.out.println(a2.b);
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
		
		C2 c2=new C2();
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m4();
		c2.m6();
		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println(c2.d);
		System.out.println("---------------------------");
		
		A2 a21=new B2();
		a21.m1();
		a21.m2();
		a21.m3();
		
		System.out.println(a21.a);
		System.out.println(a21.b);
		System.out.println("---------------------------");
		
		A2 a22=new C2();
		a22.m1();
		a22.m2();
		a22.m3();
		
		System.out.println(a22.a);
		System.out.println(a22.b);
		System.out.println("---------------------------");
	}

}
