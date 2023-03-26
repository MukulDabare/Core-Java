package Super_This;

public class B1v extends A1v {
	
	int x=20;
	public void m1()
	{
		int x=30;
		System.out.println(x+":- Local Variable of m1 in B class");
		System.out.println(this.x+":- Global Variable of B class");
		System.out.println(super.x+":- Immediate parent class variable of B class");
	}

}
