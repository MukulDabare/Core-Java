package Methods;

public class TestC {
	public static void main(String[] args) {
		
		C c=new C();
		c.start();
		
		synchronized (c) {
			try {
				c.wait();//this will release the lock. And will continue the flow.
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Total:- "+c.total);
			
		}
	}

}
