package Final;

public class TestMix {
	
	public University setData(int uid, int cid, int sid)
	{
		
		Student s=new Student();
		s.uid=uid;
		s.cid=cid;
		s.sid=sid;
		return s;
	}
	
	public University setData1(int scid)
	{
		School sc=new School();
		sc.scid=scid;
		return sc;
	}
	public void getDisplay(Student stu, School sc)
	
	{
		stu.m1();
		System.out.println("Student Name:- "+stu.sname);
		System.out.println("Student Id:- "+stu.sid);
		System.out.println("College Name:- "+stu.cname);
		System.out.println("College Id:- "+stu.cid);
		sc.m1();
		System.out.println("School Name:- "+sc.scname);
		System.out.println("School Id:- "+sc.scid);
		System.out.println("University Name:- "+stu.uname);
		System.out.println("University Id:- "+stu.uid);
	}
	public static void main(String[] args) {
		
		TestMix t=new TestMix();
		Student s= (Student) t.setData(101,303,404);
		School sc=(School) t.setData1(202);
		t.getDisplay(s, sc);
		
	}

}
