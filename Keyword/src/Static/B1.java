package Static;

public class B1 extends A1{
	
	static 
	{
		System.out.println("Static block 3-B1");
	}
	static 
	{
		System.out.println("Static block 4-B1");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
	}


}
