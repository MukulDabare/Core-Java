package Runtime_Exception;

public class Task7 {
	
	public static void main(String[] args) {
		
		   System.out.println("main______start");
		   try {
			A a=null;
			System.out.println(a.toString());	
			
	     }
		   catch(NullPointerException e)
		   {
			   e.printStackTrace();
			   System.out.println("Catch block");
		   }
			   System.out.println("main end");
		   
	}
	
		   
}

