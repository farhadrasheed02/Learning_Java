package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.jar.Attributes.Name;
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
		

		// 2. Traverse method second (Iterator)  // forward traverse 
		System.out.println("_________________________________________");
			Iterator<String> iter=arr.iterator();     //This is a method call on the object arr --> (arr.iterator();
			while(iter.hasNext())
			{
				String itr = iter.next();
				System.out.println(itr);
			}
			
			// 3.Backward Traverse
			System.out.println("_____________+++++++++++++++++++++++++++________________");
			ListIterator<String> rever= arr.listIterator(arr.size());  // while traversing backward it is important to user (var.size()) in this case var is (arr) of ArrayList...
			while(rever.hasPrevious())
			{
				String str = rever.previous();
				System.out.println(str);
			}
		
			// 4.For Each Method
			
			System.out.println("____________+++++________________");
			arr.forEach(Str->{
				System.out.println(Str);
			});
	}

}
