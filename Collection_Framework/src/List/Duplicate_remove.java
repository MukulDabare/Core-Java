package List;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Duplicate_remove {
	
	public static void main(String[] args) {
		List<Integer> no= new ArrayList<Integer>();
		no.add(10);
		no.add(50);
		no.add(30);
		no.add(30);
		
//		Set<Integer> dis=new LinkedHashSet<Integer>(no);
//		dis.forEach(n->System.out.println(n));
		Set<Integer>sort=new TreeSet<Integer>(no);
		sort.forEach(n->System.out.println(n));
		
		
	}

}
