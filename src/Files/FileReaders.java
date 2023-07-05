package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=null;
		File file = new File("..\\Learning_Java\\src\\test.txt");
		try {
			//FileReader fr = new FileReader(file);
			 br= new BufferedReader(new FileReader(file));  // combining two lines into one..16-17 line into one
		
			  
			String line ;
			while(( line= br.readLine()) != null)
			{
			System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found :"+file.toString());
		} catch (IOException e) {
			System.out.println("No data found in the file"+file.toString());
		}
		
		br.close();
	}

}
