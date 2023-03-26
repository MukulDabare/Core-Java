package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class F {
	public static void main(String[] args) {
		
		Set<String> mH=new TreeSet<String>();
		mH.add("A-City-maha");
		mH.add("C-City-maha");
		mH.add("B-City-maha");
		mH.add("A-City-maha");
		
		Set<String> gJ=new TreeSet<String>();
		gJ.add("D-City-guju");
		gJ.add("A-City-giju");
		System.out.println("\nBy using LinkedHashSet:");
		Set<Set<String>> state=new LinkedHashSet<Set<String>>();
		state.add(mH);
		state.add(gJ);
		Iterator<Set<String>> itr = state.iterator();
		while(itr.hasNext())
		{
			Set<String> s1 = itr.next();
			Iterator<String> itr2 = s1.iterator();
			while(itr2.hasNext())
			{
				String s2 = itr2.next();
				System.out.println(s2);
			}
		}
		
	}

}
