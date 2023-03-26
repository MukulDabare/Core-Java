package while_loop_do_while;

public class Starpattern {
	
public static void main(String[] args) {
		
		System.out.println("Using while loop ");
		System.out.println("\n"); 
			int i=1;
			while(i<=5)
			{
				int j=1;
				while(j<=i)
				{
					System.out.print("*");
					j++;
				}
				System.out.println();
			  i++;
			}
			int a=1;
			while(a<=5)
			{
				int b=5;
				while(b>=a) 
				{
					System.out.print("*");
					b--;
				}
				System.out.println();
			 a++;
			}
			
			
			
			
			
	System.out.println("\n");		
	System.out.println("---------------------------------------------------------");
	System.out.println("\n");
	System.out.println("Using do-while loop "+ "\n");

		int k=1;
		do 
		{
			int l=1;
			do
			{
				System.out.print("*");
				l++;
			}
			while(l<=k);
			System.out.println();
			
			k++;
		}
		while(k<=5);
		
		int m=1;
		do
		{
			int n=5;
			do 
			{
				System.out.print("*");
				
				n--;
			}
			while(n>=m);
			System.out.println();
		m++;	
		}
		while(m<=5);
		
    }

}
