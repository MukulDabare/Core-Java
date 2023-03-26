package Overriding;

public class Test {
	
	public static void main(String[] args) {
		
		
		System.out.println("Reference Class A:\nResults:-\n");
		A b=new B(101,"Manik");
		System.out.println(b); //b.toString() of object class is override in parent class of B i.e A
		b.m1();
		b.m3();
		b.m5();
		b.m4();
		b.m6();
		System.out.println("-------------------------------\n");
		System.out.println("Reference Class B:\nResults:-\n");
		
		
		B b1=new B(102,"Daniya");
		System.out.println(b1); //b.toString() of object class is override in parent class of B i.e A
		b1.m1();
		b1.m3();
		b1.m5();
		b1.m4();
		b1.m6();
		
	}

}
