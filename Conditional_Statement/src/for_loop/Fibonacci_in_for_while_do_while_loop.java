package for_loop;

public class Fibonacci_in_for_while_do_while_loop {
	
	public static void main(String[] args) {
		
		System.out.print("1) Fibonacci by Using for loop: ");
		int a=0;
		int b=1;
		int count=11;
		System.out.print(a+" "+b);
		 
		for(int i=1; i<=count; i++)
		{
		 
		  int c=a+b;
		  System.out.print(" "+c);
		  a=b;
		  b=c;
	 
		}
		System.out.println();
		System.out.print("2) Fibonacci by Using while loop: ");
		int a2=0;
		int b2=1;
		int d=1;
		System.out.print(a2+" "+b2);
		while(d<=count)
		{
			 
			  int c2=a2+b2;
			  System.out.print(" "+c2);
			  a2=b2;
			  b2=c2;
					  
			  d++;
		}
		
		System.out.println();
		System.out.print("3) Fibonacci by Using do-while loop: ");
		int a3=0;
		int b3=1;
		int e=1;
		System.out.print(a3+" "+b3);
		do 
		{
			int c3=a3+b3;
			  System.out.print(" "+c3);
			  a3=b3;
			  b3=c3;
					
		      e++;
		      
		}while(e<=count);
		
	}

}
