package SingleTon;

public class TestA1 {
	
	public static void main(String[] args) {
		
		A1 a1= A1.getA1();
		System.out.println(a1);
		A1 a2=A1.getA1();
		System.out.println(a2);
		A1 a3=A1.getA1();
		System.out.println(a3);
		// all the objects of A1 will point the same Object.
		//like a1, a2, and a3 are pointing the same Object.
	}

}
