package Two;

import One.A;

public class C extends A {
	
	public static void main(String[] args) {
		System.out.println("Package Two");
		
		A a=new A();
	  System.out.println("a="+a.a);
//	  System.out.println(a.b);
//	  System.out.println(a.c);
//	  System.out.println(a.d);
	  a.m1();
//	  a.m2();
//	  a.m3();
//	  a.m4();
	  
	  C c=new C();
	  System.out.println("a="+c.a);
   // System.out.println(c.b);
	  System.out.println("c="+c.c);
  //  System.out.println(c.d);
	    c.m1();
	  //c.m2();
	    c.m3();
	 // c.m4();
	  
	  
	  
	}

}
