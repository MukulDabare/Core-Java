package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class D {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setRollno(101);
		s1.setName("Manik");
		
		Student s2=new Student();
		s2.setRollno(102);
		s2.setName("Sajnik");
		
		Employee e1=new Employee();
		e1.setEid(111);
		e1.setEname("Daniya");
		
		Employee e2=new Employee();
		e2.setEid(222);
		e2.setEname("Nadiya");
		System.out.println("By using HashSet:");
		Set<Object> set=new HashSet<Object>();
		set.add(s1);
		set.add(s2);
		set.add(e1);
		set.add(e2);
		
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof Student)
			{
				System.out.println("\nStudent Details:");
				Student s = (Student) obj;
				System.out.println(s.getName());
				System.out.println(s.getRollno());
				
			}
			if (obj instanceof Employee)
			{
				System.out.println("\nEmployee Details:");
				Employee e= (Employee) obj;
				System.out.println(e.getEname());
				System.out.println(e.getEid());
				
			}
		}
		System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		 System.out.println("By using Enhance For loop:");
      for(Object obj: set)
      {
    	  if(obj instanceof Student)
			{
				System.out.println("\nStudent Details:");
				Student s = (Student) obj;
				System.out.println(s.getName());
				System.out.println(s.getRollno());
				
			}
			if (obj instanceof Employee)
			{
				System.out.println("\nEmployee Details:");
				Employee e= (Employee) obj;
				System.out.println(e.getEname());
				System.out.println(e.getEid());
				
			} 
      }
      System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
      System.out.println("By using LinkedHashSet:");
      Set<Object> o= new LinkedHashSet<Object>(set);
      for(Object ect: o)
      {
    	  if(ect instanceof Student)
			{
				System.out.println("\nStudent Details:");
				Student s = (Student) ect;
				System.out.println(s.getName());
				System.out.println(s.getRollno());
				
			}
			if (ect instanceof Employee)
			{
				System.out.println("\nEmployee Details:");
				Employee e= (Employee) ect;
				System.out.println(e.getEname());
				System.out.println(e.getEid());
				
			} 
      }
		
	}

}
