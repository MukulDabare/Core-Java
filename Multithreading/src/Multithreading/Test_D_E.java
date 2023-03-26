package Multithreading;

public class Test_D_E {
	public static void main(String[] args) {
		
		D d1=new D();
	
		E e1=new E(d1,'A','Z');
		E e2=new E(d1,'a', 'z');
		e1.setName("ALPHA");
		e2.setName("sigma");
		e1.start();
		e2.start();
	}

}
