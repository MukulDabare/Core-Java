package Sorting;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestE_2 {
	public static void main(String[] args) {
		
		Set<Employee> e=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sort Type:"+
		                   "\n1.For name wise sorting"+
				           //"\n2.For age wise sorting"+
		                   "\n2.For ID wise sorting");
		int ch=sc.nextInt();
		switch(ch) {
		case(1):
			Comparator<Employee> cmp1=(o1, o2) ->o1.getName().compareTo(o2.getName());
			  e= new TreeSet<Employee>(cmp1); 
			  break;
	     case(2):
			//Comparator<Employee> cmp3=(o1, o2)-> o1.getEid()-o2.getEid();
	    	 Eidsort es=new Eidsort();
			e=new TreeSet<Employee>(es);
			break;
		default:
			System.out.println("Invalid Choice Entered");
			break;
		
		}
		//Set<Employee> e=new TreeSet<Employee> ();
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
		e.forEach((emp)-> System.out.println("Employee Name: "+emp.getName()
		                                      +"  Employee ID: "+emp.getEid()));
		
	}

}
