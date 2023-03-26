package practice;

public class Test {

	public Course setCourse(int cid, String cname)
	{
		Course c=new Course(cid,cname);
		return c;	
	}
	public Faculty setFaculty(int fid, String fname, Course c1)
	{
		Faculty f=new Faculty(fid, fname, c1);
		return f;
	}
	public Batch setBatch(int bid, String bname, Faculty f1)
	{
		Batch b=new Batch(bid, bname, f1);
		return b;
	}
	public Student setStudent(int sid, String sname, Batch b1)
	{
		Student s=new Student(sid, sname, b1);
		return s;
		
	}
	public void getDisplay(Student s)
	{
		System.out.println(s.sname);
		System.out.println(s.sid);
		System.out.println(s.batch.bname);
		System.out.println(s.batch.bid);
		System.out.println(s.batch.faculty.fname);
		System.out.println(s.batch.faculty.fid);
		System.out.println(s.batch.faculty.course.cname);
		System.out.println(s.batch.faculty.course.cid);
	}
	
	public static void main(String[] args) 
	{
		Test t=new Test();
		 Course cp=t.setCourse(4, "Power Computers");
		 Faculty fp=t.setFaculty(3, "Dr.CPU", cp);
		 Batch bp=t.setBatch(2, "Hackers", fp);
		 Student sp=t.setStudent(1, "Max Black ", bp);
		 t.getDisplay(sp);
	}
	
}
