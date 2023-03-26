package Array;

public class Student_Array {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setRollno(121);
		s1.setName("Manik");

		Student s2=new Student();
		s2.setRollno(122);
		s2.setName("Sajnik");
		
		Student s3=new Student();
		s3.setRollno(123);
		s3.setName("Daniya");
		
		Student stu[]= {s1,s2,s3};
		for(int i=0; i<stu.length; i++)
		{
			System.out.println(stu[i].getRollno());
			System.out.println(stu[i].getName());
		}
	}
}
