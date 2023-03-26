package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C {
	public static void main(String[] args) {
		
		List<Integer> al= new ArrayList<Integer>();
		al.add(3);
		al.add(5);
		al.add(5);
		al.add(1);
		al.add(2);
		Set<Integer> s=new TreeSet<Integer>(al);//elements are sorted and 
		                                        //duplicate elements are removed 
		System.out.println(s);
		Collections.sort(al); //elements are sorted, and duplicate elements are kept.
		System.out.println(al);
	
		
	}

}
