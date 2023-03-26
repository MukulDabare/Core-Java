package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_stu_emp {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setRollno(11);
		s1.setName("Manik");
		s1.setCity("Jammu");
		
		Student s2=new Student();
		s2.setRollno(12);
		s2.setName("Sajnik");
		s2.setCity("Ludhiaana");
		
//		List<Student> stu=new ArrayList<Student>();
//		stu.add(s1);
//		stu.add(s2);
		
		Employee e1=new Employee();
		e1.setEid(101);
		e1.setEname("Daniya");
		e1.setCity("Kashmir");
		
		Employee e2=new Employee();
		e2.setEid(102);
		e2.setEname("Jassi");
		e2.setCity("Nagpur");
		
//		List<Employee> emp=new ArrayList<Employee>();
//		emp.add(e1);
//		emp.add(e2);
		
		List<Object> list= new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(e1);
		list.add(s2);
		
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext())
		{
			
			Object obj = itr.next();
			
			if(obj instanceof Student)
			{
				System.out.println("\nStudent Details:");
				Student s = (Student) obj;
				System.out.println(s.getName());
				System.out.println(s.getRollno());
				System.out.println(s.getCity());
			}
			if (obj instanceof Employee)
			{
				System.out.println("\nEmployee Details:\n");
				Employee e= (Employee) obj;
				System.out.println(e.getEname());
				System.out.println(e.getEid());
				System.out.println(e.getCity());
			}
		}
		 System.out.println("\nBy using Enhance For loop:\n");
		for (Object obj:list)
		{
			if(obj instanceof Student)
			{
				System.out.println("\nStudent Details:");
				Student s = (Student) obj;
				System.out.println(s.getName());
				System.out.println(s.getRollno());
				System.out.println(s.getCity());
			}
			if (obj instanceof Employee)
			{
				System.out.println("\nEmployee Details:\n");
				Employee e= (Employee) obj;
				System.out.println(e.getEname());
				System.out.println(e.getEid());
				System.out.println(e.getCity());
				
			}
		}
		
		
	}

}
