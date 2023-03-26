package Multi_dimensional_array;

public class Casting {
	
	public Object m1()
	{
	 return "hey";	
	}
	
	public static void main(String[] args) {
		
		Casting c=new Casting();
		
		String s=(String)c.m1(); //casting up
		System.out.println(s);
		
		
		String str="aaaa";
		Object o=str; //casting down
		System.out.println(o);
		double d=18562.235;
		float f=(float) d;
		System.out.println(f);// casting up
		
		int i=21;
		double d1=i;// casting down
		System.out.println(d1);
		
		
	}
	

}
