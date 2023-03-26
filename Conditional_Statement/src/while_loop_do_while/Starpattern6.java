package while_loop_do_while;

public class Starpattern6 {

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
			
			int b=1;
			while(b<=5)
			{
				int c=0;
				while(c+1<b)
				{
					System.out.print(" ");
					c++;
				}
				
				int d=b;
				while(d<=5)
				{
					System.out.print("*");
					d++;
				}
			
				System.out.println();
				
             b++;
			}
			
			
			
			
			
			
	System.out.println("\n");		
	System.out.println("---------------------------------------------------------");
	System.out.println("\n");
	System.out.println("Using do-while loop "+ "\n");

		int k=1;
		do 
		{
			int l=4;
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
		
		int n=1;
		do
		{
			int o=0;
			do {
				System.out.print(" ");
				o++;
			   }while(o+1<n);
			
			int p=n;
			do {
				System.out.print("*");
				p++;
				}while(p<=5);
			
			System.out.println();
			n++;
		}while((n<=5));
		
	
		
    }
}
