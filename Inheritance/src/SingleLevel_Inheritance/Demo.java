package SingleLevel_Inheritance;

public class Demo {
	public static void main(String[] args) {
		
		C c=new C();//1
		c.m1();
		c.m2();
		c.m3();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println("---------------------------");
		
		D d=new D();//2
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		d.m5();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println("---------------------------");
		
		E e=new E();//3
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		e.m5();
		e.m6();
		System.out.println(e.a);
		System.out.println(e.b);
		System.out.println(e.c);
		System.out.println(e.d);
		System.out.println("---------------------------");
		
		C c1=new D();//4
		c1.m1();
		c1.m2();
		c1.m3();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println("---------------------------");
		
		C c2=new E();//5
		c2.m1();
		c2.m2();
		c2.m3();
		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println("---------------------------");
		
		
		D d1=new E();//6
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m4();
		d1.m5();
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println("---------------------------");
		
		
		
	}

}
