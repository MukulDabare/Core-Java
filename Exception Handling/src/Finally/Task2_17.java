package Finally;

public class Task2_17 {
	
	/*Task 18: add multiple catch and finally block with return value
 each catch block you have to add return statment

class Test
{
int mm()
{
String s1=args[0];//AAA
SOP(s1.charAt(4));
String s2=args[1];//bb //0
int f1=Integer.parseInt(s2);
int f1=10/f1;

//check which exception will be occured
and handle this exception using try and catch
}
main()
{
}
}
*/
	int mm()
	{
		
		try
		{
			String s1="AAAAA";
			System.out.println(s1.charAt(4));
			String s2="0";
			int f1=Integer.parseInt(s2);
			int f2=10/f1;
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("StringIndexOutOfBoundsException ");
			return 1;
			
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("ArithmeticException");
			return 3;
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			System.out.println("NumberFormatException");
			return 4;
		}
		finally 
		{
			System.out.println("finally block");
			return 5;
		}
	
	

	
	}
	public static void main(String[] args) {
		System.out.println("main start");
   		Task2_17 t=new Task2_17();
   		int i=t.mm();
   		System.out.println(i);
   		System.out.println("main end");
		
	}
	

}
