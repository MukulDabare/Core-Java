package Finally;

public class Task2_1
{
	/*Task 1:
public class Test
{
int m1(int x)
{
try{
int a=10/0;
return x;
}
catch()
{
return x;
}
}
main()
{
call m1 method
}
}
*/
	
	      int m1(int x)
	         {
	           try{
	                int a=10/0;
	                 return x;
	              }
	          catch(ArithmeticException e)
	              {
	        	    e.printStackTrace();
	                return x;
	              }
	         }
	public static void main(String[] args) {
		System.out.println("main start");
		Task2_1 t=new Task2_1();
		int i=t.m1(2);
		System.out.println(i);
		System.out.println("main end");
	}
		
	

}
