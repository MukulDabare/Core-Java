package Runtime_Exception;

public class Task8 {

	public static void main(String[] args) {
		A a=null;
		System.out.println("main__________start");
		try
		{
			System.out.println("Try------------start");
			System.out.println(a.toString());
			System.out.println("Try--------------End");
		}
		catch(NullPointerException e)
		{
			System.out.println("catch block");
		}
		System.out.println("main___________end");
		}

}
