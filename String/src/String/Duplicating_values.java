package String;

public class Duplicating_values {

	public static void main(String[] args) {
		int count;
		String s1="Duplicating values";
		String s2=s1.toLowerCase();
		
		char [] string=s1.toCharArray(); 
		
		System.out.println("Duplicating values: ");
		for (int i=0; i<string.length;i++)
		{ 
			count=1;
			   for(int j=i+1; j<string.length; j++)
			  {
				if(string[i]==string[j] && string[i]!=' ')
				{
					count ++;
					string[j]=0;
					
				}
			}
			if(count >1 && string[i]!='0')
			{
				System.out.println(" "+string[i]);
			}
		}
		System.out.println();
	}
}
