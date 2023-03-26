package December;

import java.util.Arrays;

public class Bubble_sort {
	
	public static void main(String[] args) {
		
		int []a= {12,85,462,456,125,452,63,987,26521,452,364,256};
		
//		for(int i=0;i<a.length; i++)
//		{
//			for(int j=1; j<a.length; j++)
//			{
//				int c=0;
//				if(a[j-1]>a[j])
//				{
//					c=a[j-1];
//					a[j-1]=a[j];
//					a[j]=c;
//				}
//			}
//		}
		
//		for(int b:a)
//		{
//			System.out.print(b+",");
//		}
		
		Arrays.sort(a);
		for(int b:a)
			{
				System.out.print(b+",");
			}
	}

}
