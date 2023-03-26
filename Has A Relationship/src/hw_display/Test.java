package hw_display;

public class Test 
{

	 public Course setCourse(int c1id, String c1name) 
	 {
		 
		 Course c=new Course();
		 c.setCid(c1id);
		 c.setCname(c1name);
		 return c;										
		
	 }
	 
	 public Faculty setFaculty(int f1id, String f1name, Course C1)
	 {
		 
		 Faculty f=new Faculty();
		 f.setFid(f1id);
		 f.setFname(f1name);
		 f.setCourse(C1);
		 return f;
	 }
	 
	 public Batch setBatch(int b1id, String b1name, Faculty F1 ) 
	 {
		 
		 Batch b=new Batch();
		 b.setBid(b1id);
		 b.setBname(b1name);
		 b.setFaculty(F1);
		 return b;
	 }
	 
	 public Student setStudent(int s1id, String s1name, Batch B1) 
	 {
		 
		 Student s1=new Student();
		 s1.setSid(s1id);
		 s1.setSname(s1name);
		 s1.setBatch(B1);
		 return s1;
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
		 Course c1=t.setCourse(4, " Power Computers");
		 Faculty f1=t.setFaculty(3, " Dr.CPU", c1);
		 Batch b1=t.setBatch(2, " Hackers ", f1);
		 Student stu=t.setStudent(1, " Manik ", b1);
		 t.getDisplay(stu);
	}
	 
}
