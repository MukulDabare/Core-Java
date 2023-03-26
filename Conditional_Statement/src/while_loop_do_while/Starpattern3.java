package while_loop_do_while;

public class Starpattern3 {

public static void main(String[] args) {
		
		System.out.println("Using while loop ");
		System.out.println("\n"); 
			int i=1;
			while(i<=5)
			{
				int j=4;
				while(j>=i)
				{
					System.out.print(" ");
					j--;
				}
				int a=1;
				while(a<=i)
				{
					System.out.print("*");
					
					a++;
				}
				System.out.println();
			  i++;
			}
			
			
			
			
			
			
	System.out.println("\n");		
	System.out.println("---------------------------------------------------------");
	System.out.println("\n");
	System.out.println("Using do-while loop "+ "\n");

		int k=1;
		do 
		{
			int l=5;
			do
			{
				System.out.print(" ");
				l--;
			}
			while(l>=k);
			int m=1;
			do 
			{
				System.out.print("*");
				m++;
			}while(m<=k);
			
			System.out.println();
			
			k++;
		}
		while(k<=5);
		
	
		
    }
}
