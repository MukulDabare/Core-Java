package Array;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicateremove {
	 static String s1="";
	public static void main(String[] args) {
		
		String str="CompleteJavaClass";
		char[] ca = str.toCharArray();
		Set s=new LinkedHashSet();
	    for(char sa:ca)	
	    	s.add(sa);
	   
	    Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			s1=s1+obj;
		}
		System.out.println(s1);
	    
	    
	   
	} 
	
}
