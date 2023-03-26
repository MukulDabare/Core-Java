package SingleTon;

public class Test {

	public static void main(String[] args) {
		
		Student s1=Student.getInstance();
		s1.rollno=101;
		s1.name="Manik";
		System.out.println(s1.name+"  "+s1.rollno);
		Student s2=Student.getInstance();
		s2.rollno=202;
		s2.name="Sajnik";
		System.out.println(s2.name+"  "+s2.rollno);
		System.out.println(s1.name+"  "+s1.rollno);
		
	}
}
