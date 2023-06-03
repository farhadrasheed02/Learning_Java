package specialmethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ReportOnConsole {
	static PrintStream stream;
	public void generatereport()
	{
		 
		File file = new File("src/Results/Log.txt");
		try {
			 stream = new PrintStream(file);
			System.out.println("From now onwards the Output will be saved  in this location : - "+file.getAbsolutePath()+" and that will be you console");
			
			System.setOut(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ReportOnConsole grep = new ReportOnConsole();
		grep.generatereport();
		
	}

}
