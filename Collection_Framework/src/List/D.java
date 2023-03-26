package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D {
	
	public static void main(String[] args) {
		
		List l=new ArrayList<>();
		l.add(10);
		l.add(125462l);
		l.add(14523.0254f);
		l.add(52632.0212025d);
		l.add('a');
		l.add("Abc");
		l.add(true);
		
		System.out.println(l);
		Iterator<Object> o=l.iterator();
		while(o.hasNext())
		{
			Object ob=o.next();
			if(ob instanceof Integer)
			{
				int x=(int) ob;
				System.out.println("Integer:- "+x);
			}
			if(ob instanceof Long )
			{
				long on=(long) ob;
				System.out.println("Long:- "+on);
			}
			if(ob instanceof Float)
			{
				float f=(float) ob;
				System.out.println("Float:- "+f);
			}
			if(ob instanceof Double)
			{
				double d=(double) ob;
				System.out.println("Double:- "+d);
			}
			
			if(ob instanceof Character)
			{
				char c=(char) ob;
				System.out.println("Character:- "+c);
			}
			if(ob instanceof String)
			{
				String s=(String) ob;
				System.out.println("String:- "+s);
			}
			if(ob instanceof Boolean)
			{
				boolean b= (boolean) ob;
				System.out.println("Boolean:- "+b);
			}
		}
		 System.out.println("-----***-----");
		  System.out.println("By using enhance for loop:");
		for(Object o1:l)
		{
			if(o1 instanceof Integer)
			{
				int x=(int) o1;
				System.out.println("Integer:- "+x);
			}
			if(o1 instanceof Long )
			{
				long on=(long) o1;
				System.out.println("Long:- "+on);
			}
			if(o1 instanceof Float)
			{
				float f=(float) o1;
				System.out.println("Float:- "+f);
			}
			if(o1 instanceof Double)
			{
				double d=(double) o1;
				System.out.println("Double:- "+d);
			}
			
			if(o1 instanceof Character)
			{
				char c=(char) o1;
				System.out.println("Character:- "+c);
			}
			if(o1 instanceof String)
			{
				String s=(String) o1;
				System.out.println("String:- "+s);
			}
			if(o1 instanceof Boolean)
			{
				boolean b=(boolean) o1;
				System.out.println("Boolean:- "+b);
			}
		}
		
		
		
	}

}
