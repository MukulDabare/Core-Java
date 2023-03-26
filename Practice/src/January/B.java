package January;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;




public class B {
	public static void main(String[] args) {
		
		Map<String, Integer > m=new HashMap<>();
		m.put("Manik", 101);
		m.put("Sajnik", 102);
		
	Set<String> key = m.keySet();
	for(String name:key)
	{
		System.out.println(name);
		System.out.println(m.get(name));
		
	}
	}

}
