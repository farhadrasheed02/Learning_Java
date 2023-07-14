package udemyJavaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// working with userinput ....
		// HashSet doesnot retain order..... and does not allow duplicate as well
		System.out.println("Enter the input in String form");
		Set<String> set = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		while(!str.equalsIgnoreCase("exit"))
		{
			set.add(str);
			str= sc.nextLine();
		}
		
//			set.add(str);
//			set.add("Rashid");
//			set.add("Reshi");
//			set.add("Sultan");
//			set.add("Rasheed");
//			set.add("Reshi");
//			
//			Set<String> list = new LinkedHashSet<>(set);
//			list.add("Farhad");
//			//System.out.println(list);
			for(String string :set)
			{
				System.out.println(string);
			}
			
	
	}	

}
