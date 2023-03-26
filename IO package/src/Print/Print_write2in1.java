package Print;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_write2in1 {
	public static void main(String[] args) throws IOException {
		
	BufferedReader br=new BufferedReader(new FileReader("A.txt"));
	PrintWriter pw=new PrintWriter("F.txt");
	String line= br.readLine();
	while(line!=null)
	{
		pw.println(line);
		line =br.readLine();
	}
	br=new BufferedReader(new FileReader("E:\\IOpackage\\FileHandling\\Student.txt"));
	line =br.readLine();
	while(line!=null)
	{
		pw.println(line);
		line =br.readLine();
	}
	br.close();
	pw.close();
	System.out.println("Work Done");
	}

}
