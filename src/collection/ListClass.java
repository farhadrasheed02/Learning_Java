package collection;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		
		//TypeSafe means that we use generic <String> so we can add only one type of data i.e. in this case String
		ArrayList<String> array = new ArrayList();
	//	array.add(5); // voilates the typesafe here
		array.add("farhad");
		System.out.println(array);
		
		//UnType Safe means we can add different data type like int, string , float etc.
		
		ArrayList arr = new ArrayList();
		arr.add(4); // int
		arr.add("farhad"); // string
		arr.add(44.2); //float or double
		arr.add(4);  // duplicate can be done here as we can see
		System.out.println(arr);
		
		// indexwise data can be achieved in list so we check this property here as well
		System.out.println(arr.get(2)); // indexing is achieved and we can see order is also preserved here as well
		
	}

}
