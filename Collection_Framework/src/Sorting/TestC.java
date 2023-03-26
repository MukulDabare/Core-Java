package Sorting;

import java.util.Set;
import java.util.TreeSet;

public class TestC {
	public static void main(String[] args) {
		
		Set<Customer> c=new TreeSet<Customer>();
		
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setCname("Manik");
		Customer c2=new Customer();
		c2.setCid(108);
		c2.setCname("Sajnik");
		Customer c3=new Customer();
		c3.setCid(145);
		c3.setCname("Amrit");
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		c.forEach((cus)-> System.out.println("Customer Name: "+cus.getCname()+
				                              "  Customer ID: "+cus.getCid()));
	}

}
