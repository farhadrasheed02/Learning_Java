package GenericMethod;
import static  java.util.ArrayList.*;

import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		
		
		/// without using the Generic Method.....
		ArrayList list = new ArrayList();
		list.add("Farhad ");
		list.add("Reshi");
		System.out.println(list.get(1));
		
		// Generic Method with Parameters...
		
		ArrayList<String> lst = new ArrayList<>();
		lst.add("Farhad");
		lst.add("Rashid");
		lst.add("Haseena");
		lst.add("Sultan");
		System.out.println(lst.get(2));
		
	}

}
