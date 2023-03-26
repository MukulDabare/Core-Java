package Print;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Mix {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("M.txt"));
		bw.write("Mix Of:");
		bw.newLine();
		bw.write("BufferedWriter");
		bw.close();
		System.out.println("BufferedWriter Done");
		
		PrintWriter pw=new PrintWriter(new FileWriter("I.txt"));
		//pw.println();
		pw.print("PrintWriter");
		pw.println();
		pw.print("BufferedReader");
		pw.close();
		System.out.println("PrintWriter Done");
		
		
		PrintWriter pwm=new PrintWriter("X.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("M.txt"));
		String line = br.readLine();
		while(line!=null)
		{
			pwm.println(line);
			System.out.println(line);
			line = br.readLine();
		}
		br= new BufferedReader(new FileReader("I.txt"));
		line = br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			pwm.println(line);
			line = br.readLine();
		}
		pwm.close();
		System.out.println("All Done");
	}

}
