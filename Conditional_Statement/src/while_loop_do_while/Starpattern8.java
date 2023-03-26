package while_loop_do_while;

public class Starpattern8 {

public static void main(String[] args) {
		
		System.out.println("Using while loop ");
		System.out.println("\n"); 
		
			int i=1;
			while(i<=5)
			{
				int a=0;
				while(a+1<i)
				{
					System.out.print(" ");
					a++;
				}
				int j=5;
				while(j>=i)
				{
					System.out.print(" *");
					j--;
				}
				System.out.println();
				
				i++;
			}
			
			
			int d=5;
			int e=1;
			while(e<=d)
			{
				int f=d-1;
				while(f>=e)
				  {
					System.out.print(" ");
					f--;
				   }
				int g=1;
				while(g<=e)
				  {
					System.out.print(" *");
					g++;
				  }
			        System.out.println();
			
			 e++;
			}
	System.out.println("\n");		
	System.out.println("---------------------------------------------------------");
	System.out.println("\n");
	System.out.println("Using do-while loop "+ "\n");

		int k=1;
		do 
		{
			int m=0;
			do {
				System.out.print(" ");
				m++;
			}while(m<k);
			
			int l=5;
			do
			{
				System.out.print(" *");
				l--;
			}
			while(l>=k);
			System.out.println();
			
			k++;
		}
		while(k<=5);
		
		int h=1;
		do
		{
			int n=5;
			do
			{
				System.out.print(" ");
				n--;
			}while(n>=h);
			
			int o=1;
			do
			{
				System.out.print(" *");
				o++;
			}while(o<=h);
			
			     System.out.println();
			
			h++;
		}while(h<=5);

		
	}
}
