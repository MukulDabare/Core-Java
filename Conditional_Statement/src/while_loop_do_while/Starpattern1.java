package while_loop_do_while;

public class Starpattern1 {
	
	public static void main(String[] args) {
	System.out.println("Using while loop ");
	
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
		
System.out.println("---------------------------------------------------------");
System.out.println("Using do-while loop ");

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
	
	
	
	
	
	
	
	}

}
