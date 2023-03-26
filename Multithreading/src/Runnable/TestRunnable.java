package Runnable;

public class TestRunnable {
	public static void main(String[] args) {
		
		MyRunnable mr=new MyRunnable();
		Thread t=new Thread(mr);
		t.start();
		for(int i=1; i<10; i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Main Thread--Start");
		}
	
		try {
			//t.join();
			t.join(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for(int i=1; i<20; i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			System.out.println("Main Thread--End");
		}
	}

}
