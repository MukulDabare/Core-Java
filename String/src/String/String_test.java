package String;

import java.lang.reflect.Method;

public class String_test {
	
	public static void main(String[] args) {
		
		String s="Swarget"; //literal
		
		
		System.out.println(s.charAt(0));  //charAt(index)
		System.out.println(s.charAt(2));  //charAt(index)
		System.out.println("--------------------------------");
		
		System.out.println(s.substring(4)); //substring(int beginIndex)
		System.out.println("--------------------------------");
		
		System.out.println(s.substring(0, 3));//substring(int beginIndex, int endIndex)
		System.out.println(s.substring(3, 7));
		System.out.println("--------------------------------");
		
		String s1="Swarget";
		String s2= "Swar";
		String s3="get";
		String s4=" Swarget";
		System.out.println(s.equals(s1)); //equals()
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s4));
		System.out.println("--------------------------------");
		
		String s5="";
		String s6=" ";
		String s7="NAGPUR ";
		System.out.println(s5.isEmpty()); //isEmpty()
		System.out.println(s6.isEmpty());
		System.out.println(s7.isEmpty());
		System.out.println("--------------------------------");
		
		System.out.println(s7.concat(" Concatinated ")); // concatination()
		System.out.println(s7.concat(s3).concat(s2));
		System.out.println("--------------------------------");
		
		System.out.println(s2.toUpperCase());// touppercase()
		System.out.println(s7.toLowerCase());//tolowercase()
		System.out.println("--------------------------------");
		
		String monthyear="Nov 2022 Diwali Passed";
		String[] split=monthyear.split(" "); //split
		for(String c:split)
		{
			System.out.println(c.trim());//trim()
		}
		
		String my="Nov@2022@Diwali@Passed";
		String[] sp=my.split("@");
		for(String a:sp)
		{
			System.out.println(a.trim());
		}
		String sp1=monthyear.split(" ")[0];
		String sp2=monthyear.split(" ")[1];
		System.out.println(sp1+" "+sp2);
		System.out.println("--------------------------------");
		
		char[] b= {'A','B','C'};
		String s8=String.valueOf(b); // valueOf()
		System.out.println(s8);
		System.out.println("--------------------------------");
		
		int i=125634;
		String s9=String.valueOf(i);//value of()
		System.out.println(s9);
		System.out.println("--------------------------------");
		
		String s10=" Lion Hunts";
		char[] charArray=s10.toCharArray(); //toCharArray()
		for(char d:charArray)
			System.out.println(d);
		System.out.println("--------------------------------");
		
		
			
		
	}

}
