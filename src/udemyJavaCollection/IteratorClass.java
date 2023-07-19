package udemyJavaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List< String> list = new ArrayList<String>();
		list.add("Farhad");
		list.add("Rashid");
		list.add("Reshi");
		list.add("Haseena");
		list.add("Nighat");
		list.add("Khan");
//		Iterator<String> iterator = list.iterator();   // can't add element during iteration
		ListIterator<String> literator = list.listIterator(); // allows you to add element in run time as well...
//		String previous = literator.previous();
//		System.out.println(previous);
		while(literator.hasNext())
		{
			String str = literator.next();
			if(str.equals("Farhad"))
				literator.set("Farhad QA Dev");
//				literator.add("Jan Soub");
			if(str.equals("Haseena"))
				literator.add("Farhad's Wife");
			
//			System.out.println(str);
		}
		
		System.out.println(list);
		
	}

}
