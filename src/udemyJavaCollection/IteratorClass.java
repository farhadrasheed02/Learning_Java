package udemyJavaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			String str = iterator.next();
			System.out.println(str);
		}
		
		
		
	}

}
