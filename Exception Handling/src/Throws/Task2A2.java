package Throws;

import java.io.FileNotFoundException;

public class Task2A2 {
	
	/*Task 2:
class Demo
{
public void save()throws
{
Class.forName("CJC");
}
public void display()throws
{
save();
}
}
class Test
{
main()
{
Demo d=new Demo();
call method and handle using try and catch
}

}
*/
	public void save()throws  ClassNotFoundException
	{
	  Class.forName("CJC");
	}
	public void display()throws  ClassNotFoundException
	{
	save();
	}
	

}
