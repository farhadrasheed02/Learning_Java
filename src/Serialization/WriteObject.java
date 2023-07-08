package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteObject {
	
	public static void main(String args[])
	{
		System.out.println("Writing class...");
		PersonClass p = new PersonClass(55, "Farhad");
		System.out.println(p.toString());
		try {
			var fileoutput = new FileOutputStream("..\\Learning_Java\\src\\Serialization\\outputstream.txt");
		} catch (FileNotFoundException e) {
			
			System.out.println("We are getting the error as "+e.getMessage());
		}
	}

}
