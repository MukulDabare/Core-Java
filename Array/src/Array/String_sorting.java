package Array;

import java.util.Arrays;
import java.util.Scanner;

public class String_sorting {
public static void main(String[] args) {
	
      String []s= {"qsdf","agfsg","dsfg","ffsg","wgfs","lfsg","oertg","ghg","ied","bhgbv","xedf"};
      System.out.println("Before sorting:");
      for(String q:s)
      {
    	  System.out.print(q+",");
      }
      System.out.println();
      Arrays.sort(s);
      System.out.println("After sorting:");
      for(String q:s)
      {
    	  System.out.print(q+",");
      }
      System.out.println();
      System.out.println("Just For Fun: ");
      System.out.println("Enter the Keyword to Search ");
      Scanner sc=new Scanner(System.in);
      String inp=sc.next();
	  System.out.println("Entered keyword is on index "+Arrays.binarySearch(s, 0, s.length, inp)+" place");
	 
	 
}	
}
