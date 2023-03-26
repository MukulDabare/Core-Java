package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		
		Map<String, Integer> m=new HashMap<String, Integer>();
		m.put("a", 10);
		m.put("b", 20);
		m.put("c", 50);
		System.out.println(m);
		Set<String> key= m.keySet();
		for(String k: key)
		{
			System.out.println(k);
			Integer i = m.get(k);
			System.out.println(i);
		}
		
	}
}
