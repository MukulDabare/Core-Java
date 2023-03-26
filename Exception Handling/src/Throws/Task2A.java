package Throws;

public class Task2A {
	/*task 1:
class A
{
void m1()
{
String s1=null;
sop(s1.length());
}
public void m2()
{
m1();
}
}

class B
{
public void m3()
{
A a=new A();
a.m2();
//handle this method
}
}
class Test
{
main ()
{
B b=new B();
b.m3();
}
}
*/
	
	void m1()throws NullPointerException
	{
	   String s1=null;
	   System.out.println(s1.length());
	
	}
	public void m2()throws NullPointerException
	{
	   m1();
	}
	

}
