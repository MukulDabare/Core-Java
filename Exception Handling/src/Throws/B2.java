package Throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class B2 {
	public void m2() throws IOException
	{
		System.out.println("m2--Start");
		FileReader fr=new FileReader("abc.txt");
		System.out.println("m2--Ends");
	}

}
