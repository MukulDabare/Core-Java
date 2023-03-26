package FileHandling;

import java.io.File;
import java.io.IOException;

public class File_Creation {
	public static void main(String[] args) throws IOException {
		
		File f1=new File("Cjc");
		System.out.println(f1.mkdir());//Folder creation inside eclipse workspace
		File f2=new File(f1, "Batch");
		System.out.println(f2.mkdir());//Folder inside folder creation inside eclipse workspace.
		File f3=new File(f2, "Student.java");//File creation inside the location provided.
		System.out.println(f3.createNewFile());
		
		File f4=new File("E:\\IOpackage");//Folder creation on custom location.
		System.out.println(f4.mkdir());
		File f5=new File(f4, "FileHandling");//Folder inside folder creation on custom location.
		System.out.println(f5.mkdir());
		File f6=new File(f5, "Batch.java");//File creation inside the location provided on custom location.
		System.out.println(f6.createNewFile());
		File f7=new File(f5, "Student.txt");
		System.out.println(f7.createNewFile());
		File f8=new File(f5,"Student.java");
		System.out.println(f8.createNewFile());
		System.out.println(f8.delete());//For deleting file.
		File f10=new File(f5,"BatchofStudents.java");
		f6.renameTo(f10);//file Renaming.
		
		File fl=new File("E:\\IOpackage\\FileHandling");
		File[] f = fl.listFiles();//counting no.of files and folders.
		int fcount=0;
		int dcount=0;
		for(File f9:f)
		{
			System.out.println(f9);
			if(f9.isFile())
			{
				fcount ++;
			}
			if(f9.isDirectory())
			{
				dcount ++;
			}
		}
		System.out.println("File count:- "+fcount);
		System.out.println("Folder count:- "+dcount);
		
	}

}
