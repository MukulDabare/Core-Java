package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class A {
	public static void main(String[] args) {
		
		List<String> mh=new ArrayList<String>();
		mh.add("Mumbai");
		mh.add("Nagpur");
		List<String> gj= new ArrayList<String>();
		gj.add("Surat");
		gj.add("Somnnath");
		Map<String, List<String>> m=new HashMap<>();
		m.put("Maharastra", mh );
		m.put("Gujrat", gj);
		
		Set<String> keys= m.keySet();
		for(String k: keys)
		{
			List<String> l = m.get(k);
			for(String city:l)
			{
				System.out.println(city);
			}
		}
	
	}

}
