package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadArrayObject extends Utility  {

	public static void main(String[] args) {

		System.out.println("Reading objects...");
		String filelocation = Utility.getFileLocatioin();
		try {
			FileInputStream fileinputstream	=new FileInputStream(filelocation);
			ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
			PersonClass[] perArray = (PersonClass[]) (objectinputstream.readObject());
			for(PersonClass person : perArray)
			{
			System.out.println(person);	
			}
			@SuppressWarnings("unchecked")
			ArrayList<PersonClass> aList = (ArrayList<PersonClass>) (objectinputstream.readObject());
			for(PersonClass list : aList)
			{
				System.out.println(list);
			}
			
		objectinputstream.read();
			objectinputstream.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error generated is : "+e.toString());
		} catch (IOException e) {
			System.out.println("Error generated is : "+e.toString());
		} catch (ClassNotFoundException e) {
			System.out.println("Error generated is : "+e.toString());
		}
	}

}
