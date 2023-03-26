package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E {
	
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
		  Iterator<List<String>> itr= india.iterator();
		  while(itr.hasNext())
		  {
			List<String> s =itr.next();
			Iterator<String> itr1=s.iterator();
			while(itr1.hasNext())
			{
				String city=itr1.next();
				System.out.println(city);
			}
		  }
		  System.out.println("\n-----***-----");
		  System.out.println("By using enhance for loop:\n");
		  for(List<String> l:india)
		  {
			  for(String s:l)
			  {
				  System.out.println(s);
			  }
		  }
		  System.out.println("\nBy using forEach loop(Lambda Expression):");
		  india.forEach((cit)-> {for(String c:cit)
			  {
			    System.out.println(c);
			  }});
		  System.out.println("----OR----");
		  india.forEach((cit)-> {
              cit.forEach((city)-> System.out.println(city));
             });
		 
		  System.out.println("----OR----");
		  india.forEach((cit)-> {
			  cit.forEach(System.out::println);//By using Method Reference
		  });
		  
		 
		  
		
	}

}
