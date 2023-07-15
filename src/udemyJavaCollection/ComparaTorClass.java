package udemyJavaCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>
{
	public int compare(String str1, String str2)
	{
		int len = str1.length();
		int len2 = str2.length();
		return 0;
		
	}
}
public class ComparaTorClass {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Farhad");
		list.add("Rashid");
		list.add("Reshi");
		list.add("Haseena");
		list.add("Nighat");
		list.add("Khan");
		
		
		
		
	}

}
