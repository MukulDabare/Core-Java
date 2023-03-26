package List;

import java.util.ArrayList;
import java.util.List;

public class F {
	
	public static void main(String[] args) {
		
		List<Integer> no=new ArrayList<Integer>();
		no.add(1);
		no.add(2);
		no.add(3);
		no.add(4);
		no.add(5);
		no.add(6);
		System.out.println(no);
		System.out.println("Removing Odd numbers from above list:");
		for(int i=0; i<no.size(); i++)
		{
			if(no.get(i)%2!=0)
			{
				no.remove(i);
			}
		}
		System.out.println(no);
//		for(Integer n:no)
//		{
//			System.out.println(n);
//		}
		
	}

}
