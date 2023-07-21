package udemyJavaCollection;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructure {
	public static String[] vechicles = {"ambulance","helicopter","lifeboat"};
	
	public static String[][] drivers = 
		{
				{"Abid","Hamid","Wahid"},
				{"Farhad","Sultan","Haseena"},
				{"Irfan","Irshad","Arif"}
				
		};

	public static void main(String[] args) {
		
		Map<String,Set<String>> map = new HashMap<>();
		for(int i=0;i<vechicles.length;i++)
		{
			String vechicle= vechicles[i]; 
			//System.out.println(vechicle);
		
			String [] driverlist = drivers[i];  // way of iterating the  2D array 
			Set<String> driverSet = new LinkedHashSet<>();
			
			for(String driver : driverlist)
			{
				driverSet.add(driver);
			}
			map.put(vechicle, driverSet);
			
			//System.out.println(driverSet);
		
		Set<String> driverslist = map.get("helicopter");
		
		
		for(String str :driverslist)
		{
			System.out.println(str);
		}
		}

		
	}

}
