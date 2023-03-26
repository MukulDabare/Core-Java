package Finally;

public class Task2_2 {
	
	/*Task 2:
public class Test
{
int m1(int x,int y)
{
try{
int m=10/2;
return x;
}
catch()
{
return y;
}
}
main()
{
call m1 method
}
}
*/
	
	int m1(int x, int y)
	{
		try
		{
			int m=10/2;
			return x;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Catch block");
			return y;
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println("main start");
		Task2_2 t=new Task2_2();
		int i=t.m1(12, 24);
		System.out.println(i);
		System.out.println("main end");
	}

}
