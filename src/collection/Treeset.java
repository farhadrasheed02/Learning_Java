package collection;

import java.util.TreeSet;

public class Treeset extends LinkList {

	public static void main(String[] args) {
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(10);
		tset.add(15);
		tset.add(17);
		tset.add(9);
		System.out.println(tset);
		// traverse using for Each Method... with additional ascending order...
		tset.forEach(e->{                      // e-> used as lambda expression here it is noteworth the e can b e, str or anything desired variable of your choice...
			System.out.println(e);
		});
	}

}
