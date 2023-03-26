package MixOfAll_Inheritance_mix;

public class Test {
	
	public static void main(String[] args) {
		
		A a1=new A(); //1
		a1.m1();
		a1.m2();
		a1.m3();
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println("-------------------------------");
		
		A a2=new B();//2
		a2.m1();
		a2.m2();
		a2.m3();
		System.out.println(a2.a);
		System.out.println(a2.b);
		System.out.println("-------------------------------");
		
		A a3=new C();//3
		a3.m1();
		a3.m2();
		a3.m3();
		System.out.println(a3.a);
		System.out.println(a3.b);
		System.out.println("-------------------------------");
		
		A a4=new D();//4
		a4.m1();
		a4.m2();
		a4.m3();
		System.out.println(a4.a);
		System.out.println(a4.b);
		System.out.println("-------------------------------");
		
		B b1=new B();//5
		b1.m1();
		b1.m2();
		b1.m3();
		b1.m4();
		b1.m5();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		System.out.println("-------------------------------");
		
		B b2=new C();//6
		b2.m1();
		b2.m2();
		b2.m3();
		b2.m4();
		b2.m5();
		System.out.println(b2.a);
		System.out.println(b2.b);
		System.out.println(b2.c);
		System.out.println("-------------------------------");
		
		C c1=new C();//7
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		c1.m5();
		c1.m6();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println("-------------------------------");
		
		D d1=new D();//8
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m7();
		d1.m8();
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.e);
		System.out.println("-------------------------------");
		
		
		
	}

}
