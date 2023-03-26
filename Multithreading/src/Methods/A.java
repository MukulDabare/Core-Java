package Methods;

public class A implements Runnable {
	//use of yield Method
	@Override
	public void run() {
		Thread.currentThread().setPriority(9);
		System.out.println("Child Thread Priority "+ Thread.currentThread().getPriority());
		for(int i=1; i<20; i++)
		{
			System.out.println("Child Thread");
		}
		
	}

}
