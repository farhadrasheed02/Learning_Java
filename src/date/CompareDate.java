package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
public class CompareDate {
	public static void main(String[] args) {
		String datevalue = "2023-06-29";
//		String futuredate = "2023-06-29";
		String str = "";
		Date now = new Date();
	SimpleDateFormat simpledate 	= new SimpleDateFormat("yyyy-MM-dd");
	
	str = simpledate.format(now);
	//System.out.println(str);
	if(str.compareTo(datevalue)>0)
	{
		System.out.println("past Date");
	}
	else if(str.compareTo(datevalue)<0)
	{
		System.out.println("Future Date");
	}
	else if(str.compareTo(datevalue)==0)
	{
		System.out.println("both dates are equal");
	}
		

	}

}
