package collection;

import java.util.LinkedList;

public class GuruQuestion {
	static int countOccurrences(String str, String word)
	{
	    // split the string by spaces in an empty array....
	    String a[] = str.split(" ");
	 
	    // search for pattern in a
	    int count = 0;
	    for (int i = 0; i < a.length; i++)
	    {
	    // if match found increase count
	    if (word.equals(a[i]))
	        count++;
	    }
	 
	    return count;
	}
	public static void main(String args[])
	{
		
		GuruQuestion gq = new GuruQuestion();
		String  str = "farhad Rashid Rashid uddeshya pune eon ";
		System.out.println(gq.countOccurrences(str,"Rashid"));
		LinkedList<String> lnk = new LinkedList<String>();
		lnk.add("Farhad");
		lnk.add("Uddeysh");
		lnk.add("Farhad");
		lnk.add("Uddeysh");
		lnk.add("PUNE");
		lnk.add("EON");
		
		
		int count =0;
		for(int i=0;i<str.length()-1;i++) {
		if(str.charAt(i) == ' ' && Character.isLetter(str.charAt(i+1)) && (i > 0))
		{
			count++;
		}
		}
		count ++;
		System.out.println("number of words in string are"+count);
		
		
		
	}

}
