package GenericMethod;

import java.util.ArrayList;
import java.util.Iterator;

public class TesGen {

	

public static void main(String args[])
{
	//Testing Generic 
	ArrayList<String> arrlist = new ArrayList<String>(); // --->Type Safety..
	arrlist.add("Farhad");
	arrlist.add("Rashid");
	// arrlist.add(10)  ---> compile time error (1 advantage of the generic)
	
	System.out.println(arrlist);
	
	String s = arrlist.get(1);  // ---> does not need any type casting...
	System.out.println(s);
	
	Iterator<String> iter = arrlist.iterator();
	while(iter.hasNext())
	{
		System.out.println("Element in the ArrayList :" +iter.next());
	}
}
}
