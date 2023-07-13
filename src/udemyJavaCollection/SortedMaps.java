package udemyJavaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {

	public static void main(String[] args) {

		// John from www.caveofprogramming.com
		HashMap<Integer, String> hMap = new HashMap<>();
		TreeMap<Integer, String> tMap = new TreeMap<>();
		LinkedHashMap<Integer, String> lMap = new LinkedHashMap<>();
		System.out.println("HashMap order now :");
		testMap(hMap);
		System.out.println("TreeMap order  in natural way:");
		testMap(tMap);
		System.out.println("LinkedMap order prints the same order in which we have provided the value :");
		testMap(lMap);
		
	}
	
	public static void testMap(Map<Integer,String> map)
	{
		map.put(10, "farhad");
		map.put(0, "Jani");
		map.put(5, "Hani");
		map.put(6, "Pani");
		map.put(4, "Mani");
		for(Integer key :map.keySet())
		{
			String value = map.get(key);
			System.out.println(key +": "+value);
		}
	}

}
