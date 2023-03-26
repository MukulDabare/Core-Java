package Runnable;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<20; i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread");
		
		}
		
	}
	

}
