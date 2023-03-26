package List;
import java.util.*;

public class A {
	
	public static void main(String[] args) {
		
		List <String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("aaa");
		al.add("bbb");
		System.out.println(al);
		System.out.println("By using Enhance for loop:");
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("By using Iterator:");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
		
		
		
	}

}
