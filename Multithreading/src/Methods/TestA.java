package Methods;

public class TestA {
	public static void main(String[] args) {
		
		A a=new A();
		Thread t=new Thread(a);
		t.start();
		Thread.currentThread().setPriority(1);//minimum number means minimum priority and vice versa.
		System.out.println("Main Thread Priority "+ Thread.currentThread().getPriority());
         Thread.currentThread().yield();
		for(int i=1; i<20; i++)
		{
			System.out.println("Main Thread");
		}
	}

}
