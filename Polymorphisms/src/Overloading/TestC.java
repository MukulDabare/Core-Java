package Overloading;

public class TestC {
	
	public static void main(String[] args) {
		
		C c=new C();
		c.m1();
		c.m1(1);
		c.m1((Object)null);//Narrowing (method)
		c.m1(null);
		C c1=new C(null);
		C c2=new C((Object)null);//Narrowing (Constructor)
	}

}
