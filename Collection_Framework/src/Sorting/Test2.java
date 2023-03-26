package Sorting;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) {
		
		Set<Student2> s=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sort Type:"+
		                   "\n1.For name wise sorting"+
				           "\n2.For age wise sorting"+
		                   "\n3.For rollno wise sorting");
		int ch=sc.nextInt();
		switch(ch) {
		case(1):
			Comparator<Student2> cmp1=(o1, o2) ->o1.getName().compareTo(o2.getName());
			  s= new TreeSet<Student2>(cmp1); 
			  break;
		case(2):
			Comparator<Student2> cmp2=(o1, o2) -> o1.getAge()-o2.getAge();
			s=new TreeSet<Student2>(cmp2);
		case(3):
			Comparator<Student2> cmp3=(o1, o2)-> o1.getRollno()-o2.getRollno();
			s=new TreeSet<Student2>(cmp3);
			break;
		default:
			System.out.println("Invalid Choice Entered");
			break;
		
		}
		
		Student2 s1=new Student2();
		s1.setRollno(2);
		s1.setName("Manik");
		s1.setAge(25);
		
		Student2 s2=new Student2();
		s2.setRollno(1);
		s2.setName("Sajnik");
		s2.setAge(28);
		
		Student2 s3=new Student2();
		s3.setRollno(3);
		s3.setName("Daniya");
		s3.setAge(23);
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		s.forEach( (stu)->{
			System.out.println("Student Name:- "+stu.getName());
			System.out.println("Student Rollno:- "+stu.getRollno());
			System.out.println("Student Age:- "+stu.getAge());
			System.out.println("----------------------------------");
		});
	}

}
