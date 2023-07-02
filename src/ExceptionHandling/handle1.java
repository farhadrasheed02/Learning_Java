package ExceptionHandling;

import java.io.File;
import java.io.FileReader;

public class handle1 {

	public static void main(String[] args) {
		openFile();
		
	}
	public static void openFile()
	{
		
		File file = new File("..\\Learning_Java\\src\\file.txt");
		int ch;
		try {
			FileReader fr = new FileReader(file);
			 while ((ch=fr.read())!=-1)
		            System.out.print((char)ch);
			fr.close();
			// this will not be executed if an exception is thrown
//			System.out.println("Continuing.........");
		} catch (Exception e) {
			System.out.println("File not found "+e.getMessage());
		}
	}

}
