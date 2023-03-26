package Finally;

public class Task2_9 {
	
	/*Task 9:
public class Test
{
int m1(int x, int y ,int z)
{
try{
int x=10/0;
return x;
}
catch()
{
return y;
}
finally
{
int a=x+y;
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
		     return x;
		}
		catch(ArithmeticException e)
		{
		    e.printStackTrace();
		    System.out.println("catch block");
			return y;
		}
		finally
		{
		   int a=x+y;
		   System.out.println(a);
		}
	}
       public static void main(String[] args) {
    	System.out.println("main start");
   		Task2_9 t=new Task2_9();
   		int i=t.m1(12,524,458);
   		System.out.println(i);
   		System.out.println("main end");
	}
}
