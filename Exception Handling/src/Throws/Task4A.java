package Throws;

public class Task4A {
	/*Task 4:
class A3 
{
void m1()
 {
B3 b=new B3();
b.m2();
}
 main()
{
A3 a=new A3();
//handle Exception here.
a.m1();
}
}
class B3 {
void m2() {
Class.forName("A");
}
}
}
*/
	void m1()throws ClassNotFoundException
	 {
		Task4B b=new Task4B();
	    b.m2();
	}
	

      public static void main(String[] args) {
    	  System.out.println("main Start");
    	  Task4A a=new Task4A();
    	  try 
    	  {
			a.m1();
		  } 
    	  catch (ClassNotFoundException e) 
    	  {
			e.printStackTrace();
			System.out.println("ClassNotFoundException--catch block");
		  }
    	  System.out.println("main End");
	
}
}
