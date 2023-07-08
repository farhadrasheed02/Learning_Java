package Serialization;

public class Utility {
	static String filename;
	public static String getFileLocatioin()
	{
		 try {
			 filename = "..\\Learning_Java\\src\\Serialization\\outputstream.txt";
		} catch (Exception e) {
			
			System.out.println("Return error message is "+e.toString());
		}
		return filename;
		  
		}

}
