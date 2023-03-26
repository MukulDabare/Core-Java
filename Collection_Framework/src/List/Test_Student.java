package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_Student {
	public static void main(String[] args) {
		
		List<Student> l=new ArrayList<Student>();
		
		Student s1=new Student();
		s1.setRollno(101);
		s1.setName("Manik");
		s1.setCity("Jammu");
		l.add(s1);
		Student s2=new Student();
		s2.setRollno(102);
		s2.setName("Sajnik");
		s2.setCity("Ludhiana");
		l.add(s2);
		
		Iterator<Student> itr=l.iterator();
		while(itr.hasNext())
		{
			Student stu=itr.next();
			System.out.println("Information of "+stu.getName()+":");
			System.out.println("Name:- "+stu.getName());
			System.out.println("ROllno:- "+stu.getRollno());
			System.out.println("City:- "+stu.getCity());
			
		}
		  System.out.println("\n-----***-----");
		  System.out.println("By using enhance for loop:\n");
		for(Student stu:l)
		{
			System.out.println("Information of "+stu.getName()+":");
			System.out.println("Name:- "+stu.getName());
			System.out.println("ROllno:- "+stu.getRollno());
			System.out.println("City:- "+stu.getCity());
		}
		
	}

}
