package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class handle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("..\\Learning_Java\\src\\file.txt");
		
		try {
			FileReader fr = new FileReader(file);
			
			// this will not be executed if an exception is thrown
			System.out.println("Continuing.........");
		} catch (Exception e) {
			System.out.println("File not found "+e.getMessage());
		}
		
	}

}
