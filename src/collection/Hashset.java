package collection;

import java.util.HashSet;

import specialmethods.ReportOnConsole;

public class Hashset extends ReportOnConsole{

	public static void main(String[] args) {
		
		//System.out.println("The output will be saved in the file from now onwards :- ");
		ReportOnConsole rp = new ReportOnConsole();
		rp.generatereport();
		HashSet<String> hs = new HashSet<String>();
		hs.add("Farhad");
		hs.add("Haseena");
		hs.add("Aaliya");
		hs.add("Sultan Bin Rasheed");
		System.out.println(hs.contains("Aaliya"));
		Boolean bol = hs.add("Farhad");
		System.out.println(bol);
		
		HashSet<Double> hset = new HashSet<Double>();
		hset.add(14.14);
		hset.add(2444.145);
		hset.add(121.10);
		hset.add(new Double(12.55));
		System.out.println(hset);
		
	}

}
