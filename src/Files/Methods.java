package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Methods {
	public static String  filename= "..\\Learning_Java\\src\\example.txt";
	public static File  txtfile = new File(filename);
	
	public static BufferedWriter bfwriter;
	
	public static void openFile()
	{		
		try {
			Scanner sc = new Scanner(txtfile);
//			int val = sc.nextInt();
//			System.out.println("Read Value :"+val);
			
//			sc.next();
//			sc.nextLine();  // comment and uncomment to check the real magic
			int count =1;
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

	
	public static void writeFile()
	{
		try {
			
			bfwriter = new BufferedWriter(new FileWriter(txtfile));
			bfwriter.write(" I am working on this file write now");
			bfwriter.newLine();
			bfwriter.write("what are you doing in this matter");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File cant be written "+filename.toString());
		}
		try {
			bfwriter.close(); // if we dnt use this , there will be nothing written inside the file...
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
