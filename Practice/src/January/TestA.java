package January;

public class TestA {
	
	public A setA(int rolln, String name)
	{
		A a=new A();
		a.setRoll(rolln);
		a.setName(name);
		return a;
	}
	public void dispaly(A a)
	{
		System.out.println(a.getName());
		System.out.println(a.getRoll());
	}
	public static void main(String[] args) {

		TestA t=new TestA();
		A a = t.setA(10, "manik");
		t.dispaly(a);
		A b = t.setA(20, "Sajnik");
		t.dispaly(b);
	}

}
