package Super_This;

public class C1v extends B1v {
	
	int x=40;
	
	public void m5()
	{
		int x=50;
		System.out.println(x+":- Local Variable of m5 in C class");
		System.out.println(this.x+":- Global Variable of C class");
		System.out.println(super.x+":- Immediate parent class variable of C class");
		A1v a=new A1v();
		System.out.println(a.x+":- Variable of A class");
		
	}
	

}
