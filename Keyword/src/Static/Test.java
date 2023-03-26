package Static;

public class Test {
	
	public static A setData(int rollno, String name)
	{
		A a=new A();
		a.rollno=rollno;
		a.name=name;
		return a;
	}
	
	public static void getData(A a1)
	{
		System.out.println(a1.rollno);
		System.out.println(a1.name);
		a1.m1();
	}
	public static void main(String[] args) {
		
		
		
		A a1=setData(101, "Manik");
		getData(a1);
		
		A a2=setData(102, "Daniya");
		getData(a2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
