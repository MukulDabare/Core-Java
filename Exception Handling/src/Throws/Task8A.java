package Throws;

import java.io.File;
import java.io.IOException;

public class Task8A {
	
	/*Task 8:

class AA
{
public void m1()throws ClassNotFoundException,IOException
{
Class.forName("AA");
File f=new File("Cjc.java");
f.createNewFile();

}

}
class BB
{
public void m2()throws ClassNotFoundException,IOException
{
AA a=new AA();
a.m1();
}
}
class CC
{
void m3()throws ClassNotFoundException,IOException
{
BB b=new BB();
b.m2();
}
}
class Test
{
main()
{
CC c=new CC();
c.m2();
//handle this exception
}
}
*/
	public void m1()throws ClassNotFoundException,IOException
	{
	    Class.forName("AA");
	    File f=new File("Cjc.java");
	    f.createNewFile();

	}

	
	

}
