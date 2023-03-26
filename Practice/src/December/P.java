package December;

public class P {
	int i;
	static int j;
	
	public static void main(String[] args) {
		
		System.out.println(P.j);
		P p=new P();
		p.i=10;
		p.j=20;
		System.out.println(p.i+" "+p.j);
		
		
		P p1=new P();
		System.out.println(p1.i+" "+p1.j);
		
	}

}
