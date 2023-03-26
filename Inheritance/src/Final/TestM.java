package Final;

public class TestM {

	public University setData(int sid, int cid, int uid)
	{
		Student stu=new Student();
		stu.sid=sid;
		stu.cid=cid;
		stu.uid=uid;
		return stu;
	}
	
	public void getDisplay(Student s)
	{
		s.m1();
		System.out.println("Student Name:- "+s.sname);
		System.out.println("Student Id:- "+s.sid);
		System.out.println("College Name:- "+s.cname);
		System.out.println("College Id:- "+s.cid);
		System.out.println("University Name:- "+s.uname);
		System.out.println("University Id:- "+s.uid);
	}
	
	public static void main(String[] args) {
		
		TestM t=new TestM();
		Student s=(Student) t.setData(1, 100, 111);
		t.getDisplay(s);
		
	}
}
