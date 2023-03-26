package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A {
	public static void main(String[] args) {

		Set<Integer> s = new HashSet<>();
		s.add(4);
		s.add(20);
		s.add(2);
		s.add(4);
		System.out.println(s);

		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			int x = itr.next();
			System.out.println(x);
		}
		System.out.println("\nBy using Enhance for lopp:\n");
		for(Integer x : s)
		{
			System.out.println(x);
		}

	}

}
