package One;

public class B {
	
	public static void main(String[] args) {
		
		System.out.println("Package One");
		
		A a=new A();
		System.out.println("a="+a.a);
		//System.out.println(a.b); private variable
		System.out.println("c="+a.c);
		System.out.println("d="+a.d);
		
		a.m1();
		//a.m2(); private method
		a.m3();
		a.m4();
		
	}

}
