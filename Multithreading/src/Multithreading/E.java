package Multithreading;

public class E extends Thread {
	D d;
	char str;
	char end;
	
	
	public E(D d, char str, char end) {
		
		this.d = d;
		this.str = str;
		this.end = end;
	}


	public void run()
	{
		d.display(this.str, this.end);
	}

}
