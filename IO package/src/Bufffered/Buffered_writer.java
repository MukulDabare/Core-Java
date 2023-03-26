package Bufffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_writer {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("A.txt"));
		bw.write('A');
		bw.newLine();
		bw.write("For Apple");
		bw.newLine();
		bw.write('B');
		bw.newLine();
		bw.write("BigApple");
		bw.close();
		
	}

}
