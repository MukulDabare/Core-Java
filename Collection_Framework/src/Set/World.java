package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class World {
	public static void main(String[] args) {
		
		List<String> mH=new ArrayList<String>();
		mH.add("A-City-maha");
		mH.add("C-City-maha");
		mH.add("B-City-maha");
		mH.add("A-City-maha");
		
		List<String> gJ=new ArrayList<String>();
		gJ.add("A-City-guju");
		gJ.add("C-City-guru");
		gJ.add("B-City-guju");
		gJ.add("A-City-guju");
		
		Set<List<String>> india=new LinkedHashSet<List<String>>();
		india.add(mH);
		india.add(gJ);
		
		List<String> cal=new ArrayList<String>();
		cal.add("A-City-cal");
		cal.add("C-City-cal");
		cal.add("B-City-cal");
		cal.add("A-City-cal");
		
		List<String> aL=new ArrayList<String>();
		aL.add("A-City-alas");
		aL.add("C-City-alas");
		aL.add("B-City-alas");
		aL.add("A-City-alas");
		
		Set<List<String>> usa=new LinkedHashSet<List<String>>();
		usa.add(cal);
		usa.add(aL);
		Set<Set<List<String>>> world=new HashSet<Set<List<String>>>();
		world.add(india);
		world.add(usa);
		
		Iterator<Set<List<String>>> itr1 = world.iterator();
		while(itr1.hasNext())
		{
			Set<List<String>> a = itr1.next();
			Iterator<List<String>> itr2 = a.iterator();
			while(itr2.hasNext())
			{
				List<String> b = itr2.next();
				Iterator<String> itr3 = b.iterator();
				while(itr3.hasNext())
				{
					String c = itr3.next();
					System.out.println(c);
				}
				
			}
		}
		System.out.println("\nBy using Enhance For loop:");
		for(Set<List<String>> a:world )
		{
			for(List<String> b:a)
			{
				for(String c:b)
				{
					System.out.println(c);
				}
			}
		}
		System.out.println("\nBy using forEach loop(Lambda Expression):");
		 world.forEach((coun)->{
			 coun.forEach((cit)-> {
				 cit.forEach(System.out::println);
			 });
		 });
		
	}

}
