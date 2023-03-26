package Interface;

public class Customer {
	
	public static void main(String[] args) {
		
		RBI r1=new SBI2();
		System.out.println("SBI loan rates:");
		r1.btob();
		r1.btocar();
		r1.btohome();
		r1.btop();
		
		System.out.println("--------------------------------------");
		
		RBI r2=new CBI2();
		System.out.println("CBI loan rates:");
		r2.btob();
		r2.btocar();
		r2.btohome();
		r2.btop();
		
	}

}
