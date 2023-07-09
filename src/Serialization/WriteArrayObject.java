package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;



public class WriteArrayObject extends Utility  {
	public static void main(String args[])
	{
		System.out.println("Writing class...");
		
		PersonClass [] per = {new PersonClass(10, "farhad"), new PersonClass(11,"Hasu" ), new PersonClass(12, "Sultan bin Rashid")};
		//object as Array list
		ArrayList<PersonClass> aList = new ArrayList<>(Arrays.asList(per));
		String file = Utility.getFileLocatioin();
		try {
			var fileoutput = new FileOutputStream(file);
			ObjectOutputStream objstream = new ObjectOutputStream(fileoutput);
			objstream.writeObject(per);
			objstream.writeObject(aList);
			objstream.writeObject(aList.size());
			objstream.close();
		} catch (IOException e) 
		{	
			System.out.println("We are getting the error as "+e.toString());
		} 
	}

}
