package SingleTon;

public class TestA2 {
	
	public static void main(String[] args) {
		
		A2 a1= A2.getA2();
		System.out.println(a1);
		A2 a2=A2.getA2();
		System.out.println(a2);
		A2 a3=A2.getA2();
		System.out.println(a3);
		//this approach will create object of A2 only if request is generated.
		// all the objects of A1 will point the same Object.
		//like a1, a2, and a3 are pointing the same Object.
	}

}
