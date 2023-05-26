package collection;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("farhad");
		lst.add("haseena");
		for(String i : lst)
		{
			System.out.println("Values of the List are : - "+i);
		}
	}

}
