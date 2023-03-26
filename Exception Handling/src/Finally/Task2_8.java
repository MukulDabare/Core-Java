package Finally;

public class Task2_8 {

	/*Task 8:
public class Test
{
int m1(int x, int y ,int z)
{
try{
int a=10/2;
return x;
}
catch()
{
return y;
}
finally
{
int m=10*3;
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
	   int a=10/2;
	   return x;
	}
	catch(Exception e)
	{
	    System.out.println("catch block");
		e.printStackTrace();
        return y;
	   
	}
	finally
	{
	
		int m=10*3;
	}
}
	public static void main(String[] args) {
		System.out.println("main start");
		Task2_8 t=new Task2_8();
		int i=t.m1(12,524,458);
		System.out.println(i);
		System.out.println("main end");
	}
}

