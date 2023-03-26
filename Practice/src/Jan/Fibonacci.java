package Jan;

public class Fibonacci {
	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		int count=0;
		System.out.print(a+" "+b);
		while(count<=15)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			count ++;
		}
	}

}
