package collection;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Farhad");
		set.add("Rashid");
		//it will not duplicate the values....
		System.out.println(set);
	}

}
