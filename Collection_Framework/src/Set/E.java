package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class E {
	public static void main(String[] args) {
		
		List<String> mH=new ArrayList<String>();
		mH.add("Mumbai");
		mH.add("Pune");
		mH.add("Nagpur");
		
		List<String> gJ=new ArrayList<String>();
		gJ.add("Surat");
		gJ.add("Somnnath");
		System.out.println("\nBy using HashSet:");
		Set<List<String>> state=new HashSet();
		state.add(mH);
		state.add(gJ);
		Iterator <List<String>> itr=state.iterator();
		while(itr.hasNext())
		{
			List<String> i = itr.next();
			Iterator <String> itr1=i.iterator();
			while(itr1.hasNext())
			{
				String t = itr1.next();
				System.out.println(t);
			}
		}
	
		 System.out.println("\nBy using Enhance For loop:");
		for(List<String> s1:state)
		{
			for(String s2:s1)
			{
				System.out.println(s2);
			}
		}

		System.out.println("\n********************");
		System.out.println("\nBy using LinkedHashSet:");
		Set<List<String>> state3=new LinkedHashSet<List<String>>() ;
		state3.add(mH);
		state3.add(gJ);
		Iterator <List<String>> i2=state3.iterator();
		while(i2.hasNext())
		{
			List<String> i = i2.next();
			Iterator <String> i3=i.iterator();
			while(i3.hasNext())
			{
				String t2 = i3.next();
				System.out.println(t2);
			}
		}
		System.out.println("\nBy using Enhance For loop:");
		for(List<String> s1:state3)
		{
			for(String s2:s1)
			{
				System.out.println(s2);
			}
		}
		System.out.println("\nBy using forEach loop (Lambda Expression):");
		state.forEach((cit) -> {
				                     for(String c:cit)
					               {
					                 System.out.println(c);
					                }});
		System.out.println("----OR----");
		state.forEach((cit)-> {
			                   cit.forEach((city)-> System.out.println(city));
		                      });
		System.out.println("----OR----");
		state.forEach((cit)-> {
            cit.forEach(System.out::println);
           });
		
				
	

		
	}

}
