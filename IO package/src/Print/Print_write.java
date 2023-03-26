package Print;

import java.io.IOException;
import java.io.PrintWriter;

public class Print_write {
	public static void main(String[] args) throws IOException {
		
		PrintWriter pw=new PrintWriter("E:\\IOpackage\\FileHandling\\Student.txt");
		pw.println('C');
		pw.println("CustardApple");
		pw.println(108.108d);
		pw.flush();
		pw.close();
		System.out.println("Done");
	}

}
