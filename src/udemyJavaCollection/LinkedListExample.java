package udemyJavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		LinkedList<Integer> Llist = new LinkedList<>();
		doTiming("ArrayList", list);
		doTiming("LinkedList", Llist);
		
		
	}
	
	public static void doTiming(String type, List<Integer> list)
	{
		for(int i=0;i<1E5;i++)   // 1 E(exponential) raised to the power 5 , => (1*10)^5
		{
			list.add(i);
			
		}
		
	long start = System.currentTimeMillis();
	for(int i=0;i<1E5;i++)
	{
		list.add(i);
	}
	
	long end = System.currentTimeMillis();
	for(int i=0; i<1E5;i++)
	{
		list.add(i);
		
	}
	
	System.out.println("Time take "+(end-start)+" ms for  "+type);
	
	}

}
