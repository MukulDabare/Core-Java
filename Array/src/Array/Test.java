package Array;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Enter the no.of Students");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		Student stu[]=new Student[x];
		
		for(int i=0;i<stu.length; i++)
		  {
			Student s=new Student();
			System.out.println("Enter Student Rollno and Name resp. ");
			s.setRollno(sc.nextInt());
			s.setName(sc.next());
			stu[i]=s;
		  }
		
		System.out.println("Student details");
		
		for(int i=0; i<stu.length; i++)
		  {
			System.out.println("Student Rollno:- "+stu[i].getRollno());
			System.out.println("Student Name:- "+stu[i].getName());
		  }
		
	}
}
