package Set;

import java.util.ArrayList;
import java.util.List;

public class Generic_eg {
	
	public static void main(String[] args) {
		
		List<String> al= new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		//al.add(10);
		al.add("aaa");
		String s= al.get(0);
		
		List am=new ArrayList();
		am.add(5);
		am.add(10);
		am.add("abc");
		am.add(5);
		//int x= (int) al.get(2); //class cast exception will occur
		int x=(int) am.get(0);
		
		
	}

}
