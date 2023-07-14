package udemyJavaCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
			set.add("Farhad");
			set.add("Rashid");
			set.add("Reshi");
			set.add("Sultan");
			set.add("Rasheed");
			set.add("Reshi");
			System.out.println(set);
			for(String str : set)
			{
				System.out.println(str);
			}
			
	
	}	

}
