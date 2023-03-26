package Throws;

public class Task6A {
/*Task 6:
class A1 
{
void m1(){	
B1 b=new B1();
//Handle Exception Here
b.m2();
}
main()
{
A1 a=new A1();
a.m1();

}
}
class B1
{
void m2()
{
int a=10/0;
System.out.println(a);

}
}
*/
	
		void m1()
		{	
		  Task6B b=new Task6B();
		   //Handle Exception Here
		  try 
    	  {
			b.m2();
		  } 
    	  catch (ArithmeticException e) 
    	  {
    		  e.printStackTrace();
			 System.out.println("ArithmeticException--catch block");
			
		  }
		   
		}
		public static void main(String[] args) {
			
			System.out.println("main Start");
			Task6A a=new Task6A();
			a.m1();
			System.out.println("main Ends");
		}
	
}
