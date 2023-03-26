package Sorting;

import java.util.Set;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		
		Set<Employee> e=new TreeSet<Employee> ();
		Employee e1=new Employee();
		e1.setEid(101);
		e1.setName("Manik");
		Employee e2=new Employee();
		e2.setEid(108);
		e2.setName("Sajnik");
		Employee e3=new Employee();
		e3.setEid(145);
		e3.setName("Amrit");
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.forEach((emp)-> System.out.println(emp.getName()+" "+emp.getEid()));
		
		
	}

}
