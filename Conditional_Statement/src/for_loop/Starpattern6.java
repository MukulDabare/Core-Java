package for_loop;

public class Starpattern6 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++)
		{
			for(int j=4; j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			
			    System.out.println();
		}
		for(int i=1; i<=5;i++)
		{
			for(int j=0; j+1<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k<=5; k++)
			{
				System.out.print("*");
			}
			
			    System.out.println();
		}
	}

}
