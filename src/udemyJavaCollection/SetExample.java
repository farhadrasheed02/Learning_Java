package udemyJavaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		// HashSet doesnot retain order..... and does not allow duplicate as well
		Set<String> set = new HashSet<String>();
			set.add("Farhad");
			set.add("Rashid");
			set.add("Reshi");
			set.add("Sultan");
			set.add("Rasheed");
			set.add("Reshi");
			
			Set<String> list = new LinkedHashSet<>(set);
			list.add("Farhad");
			//System.out.println(list);
			for(String str : list)
			{
				System.out.println(str);
			}
			
	
	}	

}
