package December;

public class Prime {
	
	public static void main(String[] args) {
		
		int x=7;
		int count =0;
		
		for(int i=1; i<=x;i++)
		{
			if(x%i==0)
			{
				count ++;
			}
		}
		if (count==2)
		{
			System.out.println("Prime Number");
		}
		else {
			System.out.println("not prime");
		}
	}

}
