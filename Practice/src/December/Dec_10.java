package December;

public class Dec_10 {

	public static void main(String[] args) {
		
		for(int i=0; i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
			 System.out.print(" ");	
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0; i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
			 System.out.print(" ");	
			}
			for(int k=5; k>i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
