package January;

public class A1 {
	public static void main(String[] args) throws InvalidException {
		
		int a=10;
		int c=0;
		
		try {
			 int b=a/1;
			 if(c==0)
			{
				throw new InvalidException("Checked Exception thrown");
			}
			
		} catch (NullPointerException e) {
		
			e.printStackTrace();
		}
		
	}

}
