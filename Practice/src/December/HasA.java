package December;

public class HasA {
	public static void main(String[] args) {
	
		Faculty f=new Faculty(101, "Dr.CPU");
		Batch b=new Batch(1, "Super Computers",f);
		Student s=new Student(2, "Manik",b);
		
		System.out.println("Student Name:- "+s.name);
		System.out.println("Student Rollno:- "+s.rollno);
		System.out.println("Batch Id:- "+s.batch.bid);
		System.out.println("Batch Name:- "+s.batch.bname);
		System.out.println("Faculty Name:- "+s.batch.faculty.fname);
		System.out.println("Faculty Id:- "+s.batch.faculty.fid);
			  
	}
}
