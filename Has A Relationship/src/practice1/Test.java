package practice1;

public class Test {
	
	public Course setCourse(int cid, String cname)
	{
		Course c=new Course();
		c.setCid(cid);
		c.setCname(cname);
		return c;
		
	}
	
	public Faculty setFaculty(int fid, String fname, Course c1)
	{
		Faculty f=new Faculty();
		f.setFid(fid);
		f.setFname(fname);
		f.setCourse(c1);
		return f;
	}
	
	public Batch setBatch(int bid, String bname, Faculty f1)
	{
		Batch b=new Batch();
		b.setBid(bid);
		b.setBname(bname);
		b.setFaculty(f1);
		return b;
	}
	
	public Student setStudent(int sid,String sname, Batch b1)
	{
		Student s=new Student();
		s.setSid(sid);
		s.setSname(sname);
		s.setBatch(b1);
		return s;
	}
	public void getDisplay(Student s)
	{
		System.out.println("Student Name:- "+s.getSname());
		System.out.println("Student Id:- "+s.getSid());
		System.out.println("Batch Name:- "+s.getBatch().getBname());
		System.out.println("Batch Id:- "+s.getBatch().getBid());
		System.out.println("Faculty Name:- "+s.getBatch().getFaculty().getFname());
		System.out.println("Faculty Id:- "+s.getBatch().getFaculty().getFid());
		System.out.println("Course Name:- "+s.getBatch().getFaculty().getCourse().getCname());
		System.out.println("Course Id:- "+s.getBatch().getFaculty().getCourse().getCid());
	}
	
	public static void main(String[] args) 
	{
		
		Test t=new Test();
		Course c=t.setCourse(4, "Power Computers");
		Faculty f=t.setFaculty(3, "Dr.CPU", c);
		Batch b=t.setBatch(2, "Hackers", f);
		Student stu=t.setStudent(1, "Max Black ", b);
		t.getDisplay(stu);
	}

}
