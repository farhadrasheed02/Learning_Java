package collection;

import java.util.TreeSet;

public class Treeset extends LinkList {

	public static void main(String[] args) {
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(10);
		tset.add(15);
		tset.add(17);
		System.out.println(tset);
	}

}
