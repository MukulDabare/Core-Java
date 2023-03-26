package SingleTon;

public class A1 {
	//this approach will create object of A1 every time
	//it does not matter whether request is generated or not.
  private static A1 a =new A1();
   private A1()
   {
	   
   }
   public static A1 getA1()
   {
	   return a;
   }
  
}
