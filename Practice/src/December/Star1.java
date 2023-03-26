package December;

public class Star1 {

	public void method() {

		try {
			int x = 10 / 0;
		} catch (ArithmeticException e) {

			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		
		Star1 s=new Star1();
		s.method();
	}

}
