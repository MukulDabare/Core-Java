package Sorting;

import java.util.Comparator;

public class Cnamesort implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getCname().compareTo(o2.getCname());
	}
	

}
