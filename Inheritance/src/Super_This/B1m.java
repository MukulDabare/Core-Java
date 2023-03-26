package Super_This;

public class B1m extends A1m {
	
	public void m1()
	{
		System.out.println("Method of B class-m1");
	}
	public void m2()
	{
		m1();//can be witten as this.m1();
		//this.m1();
		super.m1();//this will call immediate parent method.
		
	}
	public final void m2(int a,int c)
	{
	    int b=10;
		System.out.println(a+" -- Parameterise Method m2 of B class");
		b=c;
		System.out.println(b);
	}

}
