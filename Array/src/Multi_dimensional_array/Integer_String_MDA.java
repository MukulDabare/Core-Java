package Multi_dimensional_array;

public class Integer_String_MDA {

	public static void main(String[] args) {
		
		Object [] [] obj=new Object[2][3];
		
		obj[0][0]=1;
		obj[0][1]="A";
		obj[0][2]=3;
		obj[1][0]="B";
		obj[1][1]=4;
		obj[1][2]="C";
		
		for(int i=0; i<obj.length;i++)
		{
		  for(int j=0; j<obj[i].length; j++)
			  {
				Object o=obj[i][j];
				
				if(o instanceof Integer)
				  {
					int x=(int) o;
					System.out.println("Integer value:- "+x);
				  }
				
				if(o instanceof String )
				  {
					String x=(String) o;
					System.out.println("String:- "+x);
				  }
			}
		}
		
    }
		
		
}

