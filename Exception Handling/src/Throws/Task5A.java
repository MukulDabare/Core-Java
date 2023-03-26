package Throws;

public class Task5A {
	/*Task 5:

class A4
{
void m1() 
{
B4 b=new B4();
b.m2();
}
main(){
A4 a=new A4();
//handle exception here
a.m1();
}
}
class B4
{
void m2()
{
String s="aaa";
System.out.println(s.charAt(4));
}
}
*/
	
		void m1() 
		{
		   Task5B b=new Task5B();
		   b.m2();
		}
		
		public static void main(String[] args) {
			
			  System.out.println("main Start");
	    	  Task5A a=new Task5A();
	    	  try 
	    	  {
				a.m1();
			  } 
	    	  catch (StringIndexOutOfBoundsException e) 
	    	  {
				e.printStackTrace();
				System.out.println("StringIndexOutOfBoundsException--catch block");
			  }
	    	  System.out.println("main End");

}
}
