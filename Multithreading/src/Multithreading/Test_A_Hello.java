package Multithreading;

public class Test_A_Hello {

	public static void main(String[] args) {
		
		Hello h=new Hello();
		A t1=new A("java", h);
		A t2=new A("classes", h);
		t1.start();
		t2.start();
	}
}
