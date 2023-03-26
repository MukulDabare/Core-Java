package hw_common_method;

public class Test {
	
	           public static void main(String[] args) {
				Course c=new Course();
				c.cid=4;
				c.cname="Power Computer ";
				
				Faculty f=new Faculty();
				f.fid=3;
				f.fname="Dr.Singara Sir";
				f.course=c;
				
				Batch b=new Batch();
				b.bid=2;
				b.bname= "Hackers";
				b.faculty=f;
				
				Student s=new Student();
				s.sid=1;
				s.sname="Manik";
				s.batch=b;
				
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
