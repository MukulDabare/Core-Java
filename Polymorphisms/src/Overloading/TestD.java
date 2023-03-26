package Overloading;

public class TestD {
	
 public static void main(String[] args) {
	
	 D d=new D((C)null);
	 D d1=new D((Object)null);
	 //D d2=new D(null); this can call all three constructor of C class
}

}
