package Methods;

public class TestB {
	public static void main(String[] args) {
		
		B b=new B();
		Thread t=new Thread(b);
		t.setDaemon(true);//this is enables Internal Thread. It works similar as a Garbage Collector for Custom Thread.
		t.start();
		try {
			t.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread");
	}

}
