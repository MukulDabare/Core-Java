package Finally;

public class Task2_10 {
	
	/*Task 10:
public class Test
{
int m1(int x, int y ,int z)
{
try{
int x=10/0;
String s=null;
sop(s.lenght())
return x;
}
catch()
{
return y;
}
finally
{
int k=x+y+z;
return z;
}
main()
{
call m1 method
}
}
*/
	int m1(int x, int y ,int z)
	{
	try{
	      int x1=10/0;
	      String s=null;
	      System.out.println(s.length());
	      return x;
	}
	catch(ArithmeticException | NullPointerException e)
	{
	    e.printStackTrace();
	    System.out.println("catch block");
		return y;
	}
	finally
	{
	      int k=x+y+z;
	      return z;
	}
	

   }
	public static void main(String[] args) {
		
		System.out.println("main start");
   		Task2_10 t=new Task2_10();
   		int i=t.m1(12,524,458);
   		System.out.println(i);
   		System.out.println("main end");
		
	}
}
