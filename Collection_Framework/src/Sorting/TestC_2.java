package Sorting;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestC_2 {
	public static void main(String[] args) {
		
		Set<Customer> c=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sort Type:"+
		                   "\n1.For name wise sorting"+
				           //"\n2.For age wise sorting"+
		                   "\n2.For ID wise sorting");
		int ch=sc.nextInt();
		switch(ch) {
		case(1):
			//Comparator<Customer> cmp1=(o1, o2) ->o1.getCname().compareTo(o2.getCname());
			Cnamesort cs=new Cnamesort();
			  c= new TreeSet<Customer>(cs); 
			  break;
	     case(2):
			Comparator<Customer> cmp3=(o1, o2)-> o1.getCid()-o2.getCid();
	    	c=new TreeSet<Customer>(cmp3);
			break;
		default:
			System.out.println("Invalid Choice Entered");
			break;
		
		}
		Customer c1=new Customer();
		c1.setCid(201);
		c1.setCname("Manik");
		Customer c2=new Customer();
		c2.setCid(208);
		c2.setCname("Sajnik");
		Customer c3=new Customer();
		c3.setCid(245);
		c3.setCname("Amrit");
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.forEach((cus)-> System.out.println("Customer Name: "+cus.getCname()+
				                             "   Customer Id: "+cus.getCid()));
	}

}
