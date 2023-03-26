package List;
import java.util.*;

public class B {
	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(5);
		l.add(10);
		l.add(30);
		l.add(10);
		System.out.println(l);
		int y=l.get(2);// for particular index
		System.out.println(y);
		System.out.println("By using Iterator:");
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext())
		{
			int x=itr.next();
			System.out.println(x);
		}
		System.out.println("By using Enhance for loop:");
		for(Integer a:l)
		{
			System.out.println(a);
		}
	}

}
