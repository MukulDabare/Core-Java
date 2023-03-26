package Throws;

public class Task1A {
	
	/*Task 1:
class A 
{
void m1()
 {
B b=new B();
b.m2();
}
 main()
{
A a=new A();
//handle Exception here.
a.m1();
}
}
class B {
void m2() {
File f=new File("abc.txt");
//create file and throws exception 
}
}
}
*/
	
    void m1()throws Exception
	 {
	    Task1B b=new Task1B();
	    b.m2();
	}
    
    
	 public static void main(String[] args) {
		 System.out.println("main --Start");
		 Task1A a=new Task1A();
		 
			//handle Exception here.
			try 
			{
				a.m1();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
				System.out.println("catch block");
			}
			 System.out.println("main --Ends");
	}
	
	

}
