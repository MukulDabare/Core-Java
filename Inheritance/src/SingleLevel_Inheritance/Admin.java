package SingleLevel_Inheritance;

public class Admin {
	
	public Student setData(int sid, String sname, int cid, String cname)
	{
		Student stu=new Student(sid, sname, cid, cname);
		return stu;
	}
	
	public void getDisplay(Student s)
	{
		System.out.println("Student Name:-"+s.sname);
		System.out.println("Student Id:- "+s.sid);
		System.out.println("College Name:- "+s.cname);
		System.out.println("College Id:- "+s.cid);
	}
	
	public static void main(String[] args) {
		
		Admin a=new Admin();
		Student s1=a.setData(101, "Manik", 100, "JMC");
		a.getDisplay(s1);
		Student s2=a.setData(102, "Sajnik", 1000, "PACK");
		a.getDisplay(s2);
		
	}

}
