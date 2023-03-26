package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practrce {
	
	public static void main(String[] args) {
		List<Integer> l= new ArrayList<Integer>();
		l.add(100);
		l.add(1450);
		l.add(40);
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext())
		{
			Integer next = itr.next();
			System.out.println(next);
		}
		
		for(Integer n:l) {
			System.out.println(n);
		}
		
		l.forEach(n-> System.out.println(n));
		
		Map<String, Integer> m=new HashMap<String, Integer>();
		m.put("Amrit", 1);
		m.put("Sajnik", 11);
		m.put("Manik", 111);
		Set<String> k = m.keySet();
		Iterator<String> itr1 = k.iterator();
		while(itr1.hasNext())
		{
			String keys = itr1.next();
			
			Integer n = m.get(keys);
			System.out.println(keys+"  "+n);
		}
		m.forEach((ke,n)->{
			System.out.println(ke);
			System.out.println(n);
		});
	
		
	}

}
