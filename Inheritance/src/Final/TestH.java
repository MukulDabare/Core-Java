package Final;

public class TestH {
	
	public University setData(int scid, int uid )
	{
		School sh=new School();
		sh.scid=scid;
		sh.uid=uid;
		return sh;
	}
	
	public void getDisplay(School sc)					
	{
		sc.m1();
		System.out.println("School Name:- "+sc.scname);
		System.out.println("School Id:- "+sc.scid);
		System.out.println("University Name:- "+sc.uname);
		System.out.println("University Id:- "+sc.uid);
		
	}
	
	public static void main(String[] args) {
		
		TestH t=new TestH();
		School s=(School) t.setData(888, 999);
		t.getDisplay(s);
	}

}
