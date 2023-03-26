package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class C {
	public static void main(String[] args) {
		System.out.println("Operations on ArrayList");
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(25);
		l.add(84);
		l.add(84);
		System.out.println(l);
		System.out.println(l.size());
		int x=(int) Collections.max(l);
		System.out.println("Max value from l:- "+x);
		int y=Collections.min(l);
		System.out.println("Minimum value:- "+y);
		l.remove(0);
		l.add(1, 108);
		System.out.println(l);
	    l.remove(1);
	    System.out.println(l.get(2));
	    l.set(1, 52);
	    System.out.println(l);
	
		Collections.sort(l);
		System.out.println("Sorted:- "+l);
		Collections.reverse(l);
		System.out.println("In reverse:- "+l);
		System.out.println("Is l ArrayList is Empty:- "+l.isEmpty());
		System.out.println(l.contains(25));
		l.clear();
		System.out.println("After clearing l:- "+l);
		System.out.println("Is l ArrayList is Empty:- "+l.isEmpty());
		System.out.println("------**-------");
		System.out.println("Operations on LinkedList");
		List l1=new LinkedList<>();	
		l1.add(8);
		l1.add("Don't you get that!");
		l1.add('B');
		l1.add(true);
		
		System.out.println(l1);
		System.out.println(l1.get(1));
		l1.set(1, "Yes I do!");
		System.out.println(l1);
		System.out.println(l1.size());
		//System.out.println(Collections.max(l1));
		
		l1.remove(1);
		l1.add(1, "Added");
		System.out.println(l1);
		//Collections.sort(l1);
		//System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		System.out.println(l1.contains(8));
		l1.clear();
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		System.out.println("-----**-----");
		
	}

}
