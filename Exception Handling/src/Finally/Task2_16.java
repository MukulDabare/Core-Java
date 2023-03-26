package Finally;

public class Task2_16 {
	
	/*Task 17: add multiple catch and finally block with return value
 each catch block you have to add return statment

class Test
{
int data()
{
String s1=args[0];

SOP(s1.charAt(0));
String s2=null;
SOP(s2.length());
int x=10/s1;
}
//check which exception will be occured
and handle this exception using try and catch

main()
{
			
}
}
*/
	
	int data()
	{
		try 
		{
			String s1="0";
			System.out.println(s1.charAt(0));
		    String s2=null;
		    System.out.println(s2.length());
		    int s3=Integer.parseInt(s1);
			int x=10/s3;
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("StringIndexOutOfBoundsException ");
			return 1;
			
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("NullPointerException ");
			return 2;
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
   		Task2_16 t=new Task2_16();
   		int i=t.data();
   		System.out.println(i);
   		System.out.println("main end");
		
	}

}
