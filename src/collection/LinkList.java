package collection;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
//			// un safe type ( means we can add any sort of datatype)
//		LinkedList lnklist =new LinkedList();
//		lnklist.add(0,"farhad Rashid Reshi");
//		lnklist.add("hasu");
//		System.out.println(lnklist);
//		//trying to create exception by accesing element out of index
//		System.out.println(lnklist.get(2));
//		
		
		int count =0;
		// we are printing a particular type of data type here. i.e String only
		LinkedList<String> str = new LinkedList<>();
		str.add("Farhad");
		str.add("Rashid");
		str.add("Reshi");
		str.add("Farhad");
		//str.remove("Reshi");
		str.add(1,"Hadi");
		str.toArray();
		System.out.println(str);
		for(String stri : str)
		{
			System.out.println(stri +"\t"+stri.length());
		}
		boolean bol = str.contains("Farhad");
		if(bol==true)
		{
			 count++;
		}
		System.out.println(count);
		System.out.println(str.contains("Farhad Rashid"));
		
		//duplicate is allowed and order is preserved here...
		System.out.println(str.get(1));
	}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
