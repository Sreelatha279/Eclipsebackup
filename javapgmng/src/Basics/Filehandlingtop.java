package Basics;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class Filehandlingtop {

	public static void main(String[] args) 
	{
//		File f1=new File("C:\\Sree");
//		if(f1.mkdir())
//		{
//			System.out.println("file is created");
//			
//		}
//		else
//		{
//			System.out.println("File not created");
//		}
		File f2=new File("C:\\Sree\\ddd.txt");
		try
		{
					
			FileWriter fw=new FileWriter(f2);
			fw.write("Sreelatha");
			fw.write("learning");
			fw.write("java");
			fw.flush();
			FileReader fr=new FileReader(f2);
			char[] arr=new char[(int)f2.length()];
			fr.read(arr);
			String s1= new String(arr);
			System.out.println(s1);
			
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
