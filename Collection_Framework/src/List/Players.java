package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Players {
	
	public static void main(String[] args) {
		
		List<String> pMen=new ArrayList<String>();
		pMen.add("MS Dhoni");
		pMen.add("Rohit Sharma");
		pMen.add("Virat Kohli");
		List<String> pWomen=new ArrayList<String>();
		pWomen.add("Smriti Mandhana");
		pWomen.add("Renuka Singh");
		pWomen.add("Mithali Raj");
		List<List<String>> bcci=new ArrayList<List<String>>();
		bcci.add(pMen);
		bcci.add(pWomen);
		Iterator<List<String>> itr= bcci.iterator();
		  while(itr.hasNext())
		  {
			List<String> s =itr.next();
			Iterator<String> itr1=s.iterator();
			while(itr1.hasNext())
			{
				String player=itr1.next();
				System.out.println(player);
			}
			 System.out.println("---------------");
		  }
		  
         System.out.println("\nBy using Enhance For loop:\n");
     
         for(List<String> s:bcci)
		 {
			 for(String s1:s)
			 {
				 System.out.println(s1);
			 }
			 System.out.println("---------------");
		 }
	}

}
