package for_loop;

public class Starpattern8 {

	public static void main(String[] args) {
		System.out.println("Using For Loop\n");
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j+1<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=5; k>=i; k--)
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
		int h=5;
		for(int i=1; i<=h; i++)
		{
			for(int j=h-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) 
			{
				
				System.out.print(" *");
			}
			
			System.out.println();
			
		}
	}
}
