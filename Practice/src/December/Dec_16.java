package December;

public class Dec_16 {
	
	public static void main(String[] args) {
		
		String s1="My";
		String s2=s1.toLowerCase();
		String s3="";
		int d=32;
		
		
		for (int i=0; i<s2.length(); i++)
		{
			for (int j=i; j<=i; j++ )
			{
				if(s1.charAt(i)!=s2.charAt(j))
				{
					char l=(char) (s1.charAt(i)+d);//converting to lower case
					 s3=s3.substring(i, i)+l;
					 System.out.print(s3);
					
			    }
				else 
				{
					 char u=(char) (s1.charAt(i)-d);//converting to upper case
					 s3=s3.substring(i, i)+u;
					 System.out.println(s3);
					
				}
			}
		}
		
			
		 
	}

}
