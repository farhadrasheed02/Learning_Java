package udemyJavaCollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamp {

	public static void main(String[] args) {

		HashMap< Integer, String> hashMap = new HashMap<>();
		hashMap.put(20,"Farhad");
		hashMap.put(26,"Haseena");
		System.out.println(hashMap);
		
		String txt = hashMap.get(20);
		//boolean txt = hashMap.containsKey("20");
		
		System.out.println(txt);
		for(Map.Entry<Integer, String> entry: hashMap.entrySet())
		{
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}

}
