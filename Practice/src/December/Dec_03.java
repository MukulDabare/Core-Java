package December;

public class Dec_03 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j+1<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=5; k>=i; k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int l=1; l<=5;l++)
		{
			for(int m=5; m>=l; m--)
			{
				System.out.print(" ");
			}
			for(int n=1; n<=l; n++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	} 
	

}
