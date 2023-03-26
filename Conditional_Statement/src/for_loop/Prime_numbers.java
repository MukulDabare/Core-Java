package for_loop;

public class Prime_numbers {
	
	public static void main(String[] args) {
		
		System.out.print("prime numbers:- ");
		for(int x=1; x<=100; x++)
		{
			
			int count=0;
			
			for(int i=1; i<=x; i++)
			{
				if(x%i==0)
				{
					count ++;
				}
			}
			if (count==2)
			{
				
				System.out.print(x+", ");
			}
			
		}
		
	}

}
