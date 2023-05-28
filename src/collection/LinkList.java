package collection;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			// un safe type ( means we can add any sort of datatype)
		LinkedList lnklist =new LinkedList();
		lnklist.add(0,"farhad");
		lnklist.add("hasu");
		System.out.println(lnklist);
		System.out.println(lnklist.get(2));
		
		
		
		// we are printing a particular type of data type here. i.e String only
		LinkedList<String> str = new LinkedList<>();
		str.add("Farhad");
		str.add("Rashid");
		str.add("Reshi");
		str.add("Farhad");
		
		//duplicate is allowed and order is preserved here...
		System.out.println(str.get(1));
	}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
