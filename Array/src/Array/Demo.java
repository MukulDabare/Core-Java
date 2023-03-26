package Array;

public class Demo {
	public static void main(String[] args) {
		
		Object obj[]=new Object[8];
		obj[0]=111;
		obj[1]="Manik";
		obj[2]=8963524325l;
		obj[3]=9.256412f;
		obj[4]=222;
		obj[5]="Nadiya";
		obj[6]=5632541235l;
		obj[7]=9.25416f;
		
		for (int i=0; i<obj.length; i++)
		{
			Object o=obj[i];
			if(o instanceof Integer)
			{
				int x=(int) o;
				System.out.println("Rollno:- "+x);
			}
			if(o instanceof String)
			{
				String x=(String) o;
				System.out.println("Name:- "+x);
			}
			if(o instanceof Long )
			{
				long x=(long) o;
				System.out.println("Mob.No:-"+x);
			}
			if(o instanceof Float)
			{
				float x=(float) o;
				System.out.println("CGPA :- "+x);
			}
		}
				
	}

}
