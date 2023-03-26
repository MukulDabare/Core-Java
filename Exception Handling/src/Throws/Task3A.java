package Throws;

import java.io.File;

public class Task3A {
	/*Task 3:
class A
{
public void m1()throws 
{

File f=new File("Cjc.java");
f.createNewFile();

}
}
class B
{
public void m2()throws
{
 A a=new A();
a.m1();
}
}
class C
{
public void m3()
{
B b=new B();
//handle exception
b.m2();
}
}
class Demo
{
main()
{
//call m3 method
}
}
*/
	public void m1()throws Exception
	{
         File f=new File("Cjc.java");
	    f.createNewFile();

	}

}
