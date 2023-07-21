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
		
		Map<String,Set<String>> mapping = new HashMap<>();
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
			
			mapping.put(vechicle, driverSet);
				
		}
		Set<String> list = mapping.get("ambulance");
		for(String findcomb : list){
			System.out.println(findcomb);
			
	
		}

		
	}

}
