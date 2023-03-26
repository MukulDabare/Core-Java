package Read_Wright_File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Read_File {
public static void main(String[] args) throws IOException {
	
	File f1=new File("E:\\IOpackage\\FileHandling\\Employee.txt");
	System.out.println(f1.createNewFile());
   FileWriter fw=new FileWriter(f1);
   fw.write("Sweet mother of all that is good and pure.\n"+"Which one is mine?\n");
   fw.write('A');
   fw.flush();
   fw.close();
	
   FileReader fr=new FileReader(f1);
//   int i = fr.read();
//   while(i!=-1)
//   {
//	   System.out.print((char)i);
//	   i=fr.read();
//   }
   char [] c=new char[(int) f1.length()];
   fr.read(c);
   for(char ch: c)
   {
	   System.out.print(ch);
   }
   FileWriter fw2= new FileWriter("E:\\IOpackage\\FileHandling\\Student.txt");//writing directly to the file.
   fw2.write("\nAny one you want bro. This one is reserved for me.");
   fw2.flush();
   FileReader fr2= new FileReader("E:\\IOpackage\\FileHandling\\Student.txt");//Reading directly from the file.
 int j = fr2.read();
 while(j!=-1)
 {
	   System.out.print((char)j);
	   j=fr2.read();
 }
   
}
}
