package Array;

import java.util.Arrays;

public class Ingteger_sort {

	public static void main(String[] args) {
		int i[]= {125,562,4215,86254,12365,789953,84,0};
		System.out.println("Before Sorting:");
		for(int j:i)
		{
			
			System.out.print(j+",");
		}
		System.out.println();
		Arrays.sort(i);
		System.out.println("After Sorting:");
		for(int j:i)
		{
			
			System.out.print(j+",");
		}
		
	}
}
