package xml_parsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class UtilityClass {
	
	public static void main(String args[])
	{
		Path filepath = Path.of("C:\\Users\\Farhad Rashid Reshi\\eclipse-workspace\\Learning_Java\\src\\xml_parsing\\XFile.xml");
		String str;
		try {
			str = Files.readString(filepath);
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
