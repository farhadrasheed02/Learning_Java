package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Methods {
	public static void openFile()
	{
String filename = "..\\Learning_Java\\src\\example.txt";
		
		File txtfile = new File(filename);
		
		try {
			Scanner sc = new Scanner(txtfile);
			int val = sc.nextInt();
			System.out.println("Read Value :"+val);
			sc.nextLine();  // comment and uncomment to check the real magic
			int count =2;
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				
				//System.out.println(line);
				System.out.println(count+":"+line);
				count++;
				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
