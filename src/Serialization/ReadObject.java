package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject extends Utility  {

	public static void main(String[] args) {

		System.out.println("Reading objects...");
		String filelocation = Utility.getFileLocatioin();
		try {
			FileInputStream fileinputstream	=new FileInputStream(filelocation);
			ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
			PersonClass pclass = (PersonClass) objectinputstream.readObject();
			System.out.println(pclass);
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
