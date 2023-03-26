package Multithreading;

public class Test {
	public static void main(String[] args) {
		
		NumberG odd=new NumberG(1, 100);
		NumberG even=new NumberG(2, 100);
//		odd.display();
//		even.display();
		odd.setName("Odd");
		odd.start();
		even.setName("Even");
		even.start();
		try {
			odd.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
