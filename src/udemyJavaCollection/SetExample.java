package udemyJavaCollection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// working with user input ....
		// HashSet does not retain order..... and does not allow duplicate as well
		System.out.println("Enter the input in String form");
		Set<String> list = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		while(!str.equalsIgnoreCase("exit"))
		{
			list.add(str);
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
		
			for(String string :list)
			{
				System.out.println(string);
			}
			
	sc.close();
	}	

}
