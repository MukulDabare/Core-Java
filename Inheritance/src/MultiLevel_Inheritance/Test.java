package MultiLevel_Inheritance;

public class Test {
	public static void main(String[] args) {
		
		A a1=new A();//1
		a1.m1();//m1--A
		a1.m2();//m2--A
		a1.m3();//m3--A
		System.out.println(a1.a);//10
		System.out.println(a1.b);//20
		System.out.println("--------------------");
		
		A a2=new B();//2
		a2.m1();//m1--B
		a2.m2();//m2--A
		a2.m3();//m3--A
		System.out.println(a2.a);//10
		System.out.println(a2.b);//20
		System.out.println("--------------------");
		
		A a3=new C();//3
		a3.m1();//m1--B
		a3.m2();//m2--C
		a3.m3();//m3--A
		System.out.println(a3.a);//10
		System.out.println(a3.b);//20
		System.out.println("--------------------");
		
		B b1=new B();//4
		b1.m1();//m1--B
		b1.m2();//m2--A
		b1.m3();//m3--A
		b1.m4();//m4--B
		b1.m5();//m5--B
		System.out.println(b1.a);//30
		System.out.println(b1.b);//20
		System.out.println(b1.c);//40
		System.out.println("--------------------");
		
		B b2=new C();//5
		b2.m1();//m1--B
		b2.m2();//m2--C
		b2.m3();//m3--A
		b2.m4();//m4--C
		b2.m5();//m5--B
		System.out.println(b2.a);//30
		System.out.println(b2.b);//20
		System.out.println(b2.c);//40
		System.out.println("--------------------");
		
		C c1=new C();//6
		c1.m1();//m1--B
		c1.m2();//m2--C
		c1.m3();//m3--A
		c1.m4();//m4--C
		c1.m5();//m5--B
		c1.m6();//m6--C
		System.out.println(c1.a);//50
		System.out.println(c1.b);//20
		System.out.println(c1.c);//40
		System.out.println(c1.d);//60
		System.out.println("--------------------");
		
		
		
		
	}

}
