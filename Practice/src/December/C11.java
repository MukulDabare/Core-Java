package December;

import java.io.FileNotFoundException;
import java.io.IOException;

public class C11 extends B11 {

	public C11() throws Exception {
		System.out.println("Kay Say");
	}
	@Override
	public void m1() throws Exception {
		System.out.println("You Doing");
	}

	public static void main(String[] args) {

		try {
			C11 c = new C11();
			c.m1();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
