package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C {
@SuppressWarnings("unlikely-arg-type")
public static void main(String[] args) {
	
	Map<Integer, String> mh= new HashMap<Integer, String>();
	mh.put(440015, "Nagpur");
	mh.put(400001, "Mumbai");
	mh.put(411001, "Pune");
	Set<Integer> m = mh.keySet();
	System.out.println("Map of Maharashtra {Cityname (pin) }:");
	for(Integer s:m)
	{
		
		String city = mh.get(s);
		System.out.println(city+" ("+ s +")");
		//System.out.println(s+"(pin)");
	}
	Map<Integer, String> gj=new HashMap<Integer, String>();
	gj.put(395003, "Surat");
	gj.put(306401, "Somnath");
	Set<Integer> g=gj.keySet();
	System.out.println("\nMap of Gujarat {Cityname (pin) }:");
	for(Integer p:g)
	{
		//System.out.println(p);
		String city=gj.get(p);
		System.out.println(city+" ("+ p +")");
	}
	
	Map<String, Map<Integer, String>> india= new HashMap<String, Map<Integer,String>>();
	india.put("Maharastra", mh);
	india.put("Gujrat", gj);
	
	Set<String> i = india.keySet();
	System.out.println("\nBy using Enhance For lop:");
	System.out.println("Map of India {Cityname (pin) }:-");
	for(String s:i)
	{
		System.out.println("State Name: "+s);
		Map<Integer, String> state = india.get(s);
		Set<Integer> st = state.keySet();
		for(Integer p:st)
		{
			//System.out.println(p);
			String city = state.get(p);
			System.out.println(city+" ("+ p +")");
		}
	}
	System.out.println("\nBy using Iterator:");
	Iterator<String> itr1 = i.iterator();
	while(itr1.hasNext())
	{
		String key = itr1.next();
		System.out.println("State Name: "+key);
		Map<Integer, String> state = india.get(key);
		Set<Integer> city = state.keySet();
		Iterator<Integer> itr2 = city.iterator();
		while(itr2.hasNext())
		{
			Integer key2 = itr2.next();
			//System.out.println(key2);
			String cityname = state.get(key2);
			System.out.println("City Name:-"+cityname+", "+" PIN:- "+key2);
		}
		
	}
	System.out.println("\nBy using forEach loop(Lambda Expression):");
	india.forEach((key, value)->{
		Map<Integer, String> state = india.get(key);
		state.forEach((key1,value1)->{
			String city = state.get(key1);
			System.out.println("City Name:-"+city+", "+" PIN:- "+key1);
		});
	});
	
	
}
}
