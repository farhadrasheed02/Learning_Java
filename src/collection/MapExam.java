package collection;
import java.util.HashMap;
public class MapExam {
	public static void main(String args[])
	{
		HashMap<String,Integer> hmap = new HashMap<>();
		hmap.put("Farhad",25);
		hmap.put("Rashid",15);
		hmap.put("Khushboo",23);
		hmap.put("Irfan", 22);
		hmap.put("Arif", 20);
		hmap.put("Sultan",2);
		System.out.print(hmap);
		hmap.forEach((e1,e2) ->
		{
			System.out.println(e1+"=>"+e2);
		});
		
		System.out.println("Age of Farhad is :- "+hmap.get("Farhad"));
		System.out.println("20 is the age of :- "+hmap.containsValue(20));
	}


}
