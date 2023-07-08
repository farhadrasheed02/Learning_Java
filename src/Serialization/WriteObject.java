package Serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Files.FileWrite;



public class WriteObject extends Utility  {
	public static void main(String args[])
	{
		System.out.println("Writing class...");
		PersonClass p = new PersonClass(55, "Farhad");
		System.out.println(p.toString());
		String abc = Utility.FileLocatioin("filename");
		try {
			var fileoutput = new FileOutputStream(abc);
			ObjectOutputStream objstream = new ObjectOutputStream(fileoutput);
			objstream.writeObject(p);
			objstream.close();
		} catch (IOException e) 
		{	
			System.out.println("We are getting the error as "+e.toString());
		} 
	}

}
