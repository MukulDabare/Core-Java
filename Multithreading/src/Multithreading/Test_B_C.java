package Multithreading;

public class Test_B_C  {
	
	public static void main(String[] args) {
		
		B b=new B();
	   
		C c1=new C("Phython", b);
		C c=new C("Batch", b);
		c1.setName("A");
		c.setName("B");
		c1.start();
		c.start();
	}

}
