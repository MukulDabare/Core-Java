package hw_setter_getter;

public class Test {

	 public static void main(String[] args) {
		
		 Course c=new Course();
		 c.setCid(4);
		 c.setCname(" Power Computers ");
		 
		 Faculty f=new Faculty();
		 f.setFid(3);
		 f.setFname(" Dr.CPU ");
		 f.setCourse(c);
		 
		 Batch b=new Batch();
		 b.setBid(3);
		 b.setBname(" Hackers");
		 b.setFaculty(f);
		 
		 Student s=new Student();
		 s.setSid(1);
		 s.setSname(" Manik ");
		 s.setBatch(b);
		 
			System.out.println("Student Name:- "+s.getSname());
			System.out.println("Student Id:- "+s.getSid());
			System.out.println("Batch Name:- "+s.getBatch().getBname());
			System.out.println("Batch Id:- "+s.getBatch().getBid());
			System.out.println("Faculty Name:- "+s.getBatch().getFaculty().getFname());
			System.out.println("Faculty Id:- "+s.getBatch().getFaculty().getFid());
			System.out.println("Course Name:- "+s.getBatch().getFaculty().getCourse().getCname());
			System.out.println("Course Id:- "+s.getBatch().getFaculty().getCourse().getCid());
	}
}
