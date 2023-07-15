package udemyJavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<>();
		lst.add("farhad");
		lst.add("rashid");
		lst.add("reshi");
		lst.add("sultan");
		lst.add("rasheed");
		
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println("This will print in alphabetic order : ");
		for(String str : lst)
		{
			System.out.println(str);
		}
		

	}

}
