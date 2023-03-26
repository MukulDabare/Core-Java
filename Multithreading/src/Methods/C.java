package Methods;

public class C extends Thread {
	//Using nofity and wait method inside synchronized block.
    
	int total=0;
	@Override
	public void run() {
		
		synchronized (this) {
			for(int i=1; i<=100; i++)
			{
				total= total+100;
			}
			this.notify();//this will give notify to wait method to release the lock.
		}
	}

}
