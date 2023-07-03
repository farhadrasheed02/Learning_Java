package ExceptionHandling;

import java.io.IOException;
import java.text.ParseException;

public class multipleexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In sha Allah working tommorrow");
		try {
			run();
		} catch (NoClassDefFoundError | IOException | ParseException e) {   // using try/catch multi to handle the same thing , called multiexception...
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void  run() throws IOException, NoClassDefFoundError, ParseException
	{
		throw new ParseException("I am looking into this exception", 2);
	}

}
