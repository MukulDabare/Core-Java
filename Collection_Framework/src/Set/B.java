package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class B {
	public static void main(String[] args) {
		
		List<Integer> s1=new ArrayList<Integer>();
		s1.add(4);
		s1.add(20);
		s1.add(2);
		s1.add(4);
		System.out.println(s1);
		
		Set<Integer> s2=new HashSet<Integer>(s1);//insertion order will be changed
		System.out.println(s2);
		Set<Integer> s3=new LinkedHashSet<Integer>(s1);//insertion order will not be changed
		System.out.println(s3);
		Set<Integer> s4= new TreeSet<Integer>(s1);
		System.out.println(s4);
	}

}
