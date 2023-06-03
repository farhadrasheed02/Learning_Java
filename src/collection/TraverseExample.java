package collection;
import java.util.ArrayList;
public class TraverseExample {

	public static void main(String[] args) {
		
		//Different Traverse Operations on ArrayList
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("4"); //
		arr.add("farhad"); // string
		arr.add("44.2"); //float or double
		arr.add("41");  // duplicate can be done here as we can see
		
		
		//first Traverse Operation on ArrayList
		// 1. For Each Loop
		for(String name : arr)
		{
			System.out.print(name+"\t"+ name.length()+"\t");
			
			StringBuffer sb = new StringBuffer(name);
			// will reverse the order of the words like farhad -> dahraf
			System.out.println(sb.reverse());
		}
		

		// 2.
	}

}
