package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class World {
	public static void main(String[] args) {
		
		Map<Integer, String> mh= new HashMap<Integer, String>();
		mh.put(440015, "Nagpur");
		mh.put(400001, "Mumbai");
		mh.put(411001, "Pune");
		Map<Integer, String> gj=new HashMap<Integer, String>();
		gj.put(395003, "Surat");
		gj.put(306401, "Somnath");
		Map<String, Map<Integer, String>> india= new HashMap<String, Map<Integer,String>>();
		india.put("Maharastra", mh);
		india.put("Gujrat", gj);
		
		Map<Integer, String> cal= new HashMap<Integer, String>();
		cal.put(94102,"San Francisco");
		cal.put(90210,"Beverly Hills");
		Map<Integer, String> nw=new HashMap<Integer, String>();
		nw.put(12202, "Albany");
		nw.put(10001, "New York City");
		Map<String, Map<Integer, String>> usa= new HashMap<String, Map<Integer,String>>();
		usa.put("California", cal);
		usa.put("New Work", nw);
		Map<String, Map<String, Map<Integer, String>>> world=new LinkedHashMap<String, Map<String,Map<Integer,String>>>();
		world.put("India", india);
		world.put("USA", usa);
		
		Set<String> key=world.keySet();
		Iterator<String> itr1 = key.iterator();
		while(itr1.hasNext())
		{
			
			String coun = itr1.next();
			System.out.println("Country Name "+coun+":");
			Map<String, Map<Integer, String>> country = world.get(coun);
			Set<String> key2 = country.keySet();
			Iterator<String> itr2 = key2.iterator();
			while(itr2.hasNext())
			{
				String cit = itr2.next();
				System.out.println("State Name "+cit+":");
				Map<Integer, String> state = country.get(cit);
				Set<Integer> key3 = state.keySet();
				Iterator<Integer> itr3 = key3.iterator();
				while(itr3.hasNext())
				{
					Integer pin = itr3.next();
				    String city=state.get(pin);
					System.out.println("City Name:- "+city+", PIN code:- "+pin);
				}
				System.out.println();
				
			}
			System.out.println();
		}
		System.out.println("By using Enhance For loop: ");
		for( String k:key)
		{
		       System.out.println("\n"+"Country Name "+k);
			   Map<String, Map<Integer, String>> coun = world.get(k);
		       Set<String> key2 = coun.keySet();
		       for(String k2:key2)
		       {
		    	   System.out.println("  State Name "+k2);
		    	   Map<Integer, String> cit = coun.get(k2);
		    	   Set<Integer> key3 = cit.keySet();
		    	   
		    	   for(Integer pin:key3)
		    	   {
		    		  String city=cit.get(pin);
		    		   System.out.println("     City Name:- "+city+", PIN code:- "+pin);
		    	   }
		       }
		}
		System.out.println("\nBy using forEach loop (Lambda Expression):");
       world.forEach((key1, value)->{
    	   System.out.println("\n"+"Country Name "+key1);
    	   Map<String, Map<Integer, String>> coun = world.get(key1);
    	   coun.forEach((key2, value2)-> {
    		   System.out.println("  State Name "+key2);
    		   Map<Integer, String> cit = coun.get(key2);
    		   cit.forEach((key3, value3)->{
    			   String city = cit.get(key3);
    			   System.out.println("     City Name:- "+city+", PIN code:- "+key3);
    		   });
    	   });
    	   
       });
       System.out.println("\n--------------OR----------------------");
       world.forEach((countryname, country)->{
    	   System.out.println("\nCountry Name "+countryname);
    	   country.forEach((statename, state)-> {
    		   System.out.println("  State Name "+statename);
    		     state.forEach((citypin, cityname)->{
    			   System.out.println("     City Name:- "+cityname+", PIN code:- "+citypin);
    		   });
    	   });
    	   
       });
		
		
	}

}
