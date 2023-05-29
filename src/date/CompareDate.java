package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class CompareDate {
	public static void main(String[] args) {
		System.out.println("Enter the Date in YYYY-MM-DD Format");
		try (Scanner sc = new Scanner(System.in)) {
			String datevalue = sc.nextLine();
			Date now = new Date();
			SimpleDateFormat simpledate 	= new SimpleDateFormat("yyyy-MM-dd");

			String str = simpledate.format(now);
			//System.out.println(str);
			if(str.compareTo(datevalue)>0)
			{
				System.out.println("past Date");
			}
			else if(str.compareTo(datevalue)<0)
			{
				System.out.println("Future Date"+datevalue);
				
			}
			else if(str.compareTo(datevalue)==0)
			{
				System.out.println("both dates are equal");
			}
		}
		catch(Exception e)
		{
			e.toString();
		}


	}

}
