package Throws;

import java.util.Scanner;

public class Task9A {
/*Task 9:
class P
{
void m1()
{
Scanner sc=new Scanner();
String s=sc.next();
SOP(s.charAt(8));

int x=sc.nextInt();
int y=10/x;
}
}
class Q
{
void m2()
{
P p=new P();
p.m1();
}
}
class R
{
void m3()
{
Q q=new Q();
q.m3();
}
}
class Test
{
main()
{
R r=new R();
r.m3();
handle exceptions
}
}
*/
	void m1()throws ArithmeticException, StringIndexOutOfBoundsException
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String ");
	    String s=sc.next();
	    System.out.println(s.charAt(2));
	    System.out.println("Enter Number");
	    int x=sc.nextInt();
	    int y=10/x;
	}
}
