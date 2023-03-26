package while_loop_do_while;

public class Starpattern4 {
	
public static void main(String[] args) {
		
		System.out.println("Using while loop ");
		System.out.println("\n"); 
			int i=5;
			while(i>=1)
			{
				int j=1;
				while(j<=5)
				{
					System.out.print("*");
					j++;
				}
				System.out.println();
			  i--;
			}
			
			
    System.out.println("\n");		
	System.out.println("---------------------------------------------------------");
	System.out.println("\n");
	System.out.println("Using do-while loop "+ "\n");

		int k=5;
		do 
		{
			int l=1;
			do
			{
				System.out.print("*");
				l++;
			}
			while(l<=5);
			System.out.println();
			
			k--;
		}
		while(k>=1);
		
		
		
    }

}
