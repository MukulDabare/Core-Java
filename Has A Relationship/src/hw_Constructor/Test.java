package hw_Constructor;

public class Test {

	public static void main(String[] args) {
		
		Course c=new Course(4," Power Computers");
		Faculty f=new Faculty(3,"Dr.CPU ",c);
		Batch b=new Batch(2," Hackers",f);
		Student s=new Student(1," Manik ",b);
		
		System.out.println("Student Name:- "+s.sname);
		System.out.println("Student Id:- "+s.sid);
		System.out.println("Batch Name:- "+s.batch.bname);
		System.out.println("Batch Id:- "+s.batch.bid);
		System.out.println("Faculty Name:- "+s.batch.faculty.fname);
		System.out.println("Faculty Id:- "+s.batch.faculty.fid);
		System.out.println("Course Name:- "+s.batch.faculty.course.cname);
		System.out.println("Course Id:- "+s.batch.faculty.course.cid);
	}
}
