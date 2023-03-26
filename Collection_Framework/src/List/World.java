package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World {
	public static void main(String[] args) {
		List<String> maha=new ArrayList<>();
		  maha.add("Mumbai");
		  maha.add("Pune");
		  maha.add("Nagpur");
		  
		List<String> goa=new ArrayList<>();
		  goa.add("Punji");
		  goa.add("Mhapusa");
		List<String> guj=new ArrayList<String>();
		  guj.add("Surat");
		  guj.add("Somnath");
		  
		  List<List<String>> india =new ArrayList<List<String>>();
		  india.add(maha);
		  india.add(goa);
		  india.add(guj);
		 List<String> cali=new ArrayList<String>();
		 cali.add("Sacramento");
		 cali.add("San Francisco");
		 List<String> texas=new ArrayList<String>();
		 texas.add("Austin");
		 texas.add("San Antonio");
		 List<String> newyork=new ArrayList<String>();
		 newyork.add("Albany");
		 newyork.add("New York City");
		 List<List<String>> usa =new ArrayList<List<String>>();
		 usa.add(cali);
		 usa.add(texas);
		 usa.add(newyork);
		 List<List<List<String>>> world =new ArrayList<List<List<String>>>();
		 world.add(india);
		 world.add(usa);
		 Iterator<List<List<String>>> itr=world.iterator();
	
		 while(itr.hasNext())
		 {
			 List<List<String>> i = itr.next();
			 Iterator<List<String>> itr2=i.iterator();
			 while(itr2.hasNext())
			 {
				 List<String> t = itr2.next();
				 Iterator<String> itr3=t.iterator();
				 while(itr3.hasNext())
				 {
					 String s=itr3.next();
					 System.out.println(s);
				 }
				 System.out.println("---------------");
			 }
		 }
		 System.out.println("\nBy using Enhance For loop:\n");
		 for(List<List<String>> a:world)
		 {
			 for(List<String> b:a)
			 {
				 for (String c:b)
				 {
					 System.out.println(c);
				 }
				 System.out.println("---------------");
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
