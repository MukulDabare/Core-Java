package Array;

public class Bubble_sort {

	public static void main(String[] args) {
		
		int []n= {52,456,52,1253,4853,458,6,3,5,2,4,15};
		System.out.println("Without Sorting:");
		for(int m: n)
		{
			System.out.print(m+",");
		}
		System.out.println();
		System.out.println("\nAfter Sorting in Ascending order:");
		
		for(int i=0; i<n.length; i++)
		{
			for(int j=1; j<(n.length-i); j++)
			{
				if(n[j-1]>n[j])
					
				{
				   int c=n[j-1];
					   n[j-1]=n[j];
					   n[j]=c;
				}
			}
		}
		
		for(int j:n)
		{
			System.out.print(j+",");
		}
		System.out.println();
System.out.println("\nAfter Sorting in Descending order:");
		
		for(int i=0; i<n.length; i++)
		{
			for(int j=1; j<(n.length-i); j++)
			{
				if(n[j-1]<n[j])
				{
				   int c=n[j-1];
					   n[j-1]=n[j];
					   n[j]=c;
				}
			}
		}
		
		for(int j:n)
		{
			System.out.print(j+",");
		}
	}
}
