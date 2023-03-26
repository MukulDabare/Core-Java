package Throws;

public class Task7A {
	/*Task 7:
class A2
{
void m1()
{
B2 b=new B2();
b.m2();
}
main(){
A2 a=new A2();
//Handle Exception Here
a.m1();
}
}
class B2 
{
void m2()
{
Sacnner sc=new Scanner();
int x=sc.nextInt();
int i=10/x;
System.out.println(i);
}
}
*/
	void m1()throws ArithmeticException
	{
	   Task7B b=new Task7B();
	   b.m2();
	}
	
	public static void main(String[] args) {
		
		System.out.println("main Start");
		Task7A a=new Task7A();
		 try 
   	  {
			 a.m1();
			//Handle Exception Here
	  } 
   	  catch (ArithmeticException e) 
   	  {
   		     e.printStackTrace();
			 System.out.println("ArithmeticException--catch block");
			
	 }
		 System.out.println("main ends");
		
		
	}
	

}
