package collection;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Farhad");
		hs.add("Haseena");
		hs.add("Aaliya");
		hs.add("Sultan Bin Rasheed");
		System.out.println(hs.contains("Aaliya"));
		Boolean bol = hs.add("Farhad");
		System.out.println(bol);
	}

}
