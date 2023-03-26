package Sorting;

import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		
		Set<Student> s=new TreeSet<Student>();
		
		Student s1=new Student();
		s1.setRollno(3);
		s1.setName("bbb");
		
		Student s2=new Student();
		s2.setRollno(1);
		s2.setName("ccc");
		
		Student s3=new Student();
		s3.setRollno(2);
		s3.setName("aaa");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		s.forEach((stu)-> System.out.println(stu.getRollno()+"   "+stu.getName()));
		//Rollno wise sorted 
	}

}
