package Runtime_Exception;

public class Task9 {

	public static void main(String[] args) {
		A a=null;
		System.out.println("main__________start");
		try{
			System.out.println("Try------------start");
			System.out.println(a.toString());
			System.out.println("Try--------------End");
		}
		catch(ArithmeticException e){
			System.out.println("catch block--ArithmeticException");
		}
		catch(NullPointerException e)
		{
			System.out.println("catch block--NullPointerException");
		}
		System.out.println("main___________end");
		}

}
