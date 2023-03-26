package Finally;

public class Task2_3 {
	
	/*Task 3:
public class Test
{
int m1(int x,int y)
{
try{
int m=10/0;
return x;
}
catch()
{

}
return y;
}
main()
{
call m1 method
}
}
*/
int m1(int x,int y)
  {
	try
	{
	    int m=10/0;
	    return x;
	}
	catch(ArithmeticException e)
	{
      e.printStackTrace();
      System.out.println("catch block");

	}
 return y;
}
	public static void main(String[] args) {
		
		System.out.println("main start");
		Task2_3 t=new Task2_3();
		int i=t.m1(11, 14);
		System.out.println(i);
		System.out.println("main end");
	}
	
	
	

}