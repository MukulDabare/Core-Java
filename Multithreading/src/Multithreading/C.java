package Multithreading;

public class C extends Thread {
	String string;
	B b;
	public C(String string, B b) {
		
		this.string = string;
		this.b = b;
	}
	public void run()
	{
		b.display(this.string);
	}

}
