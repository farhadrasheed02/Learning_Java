package udemyJavaCollection;

import java.util.ArrayList;

public class ArrayListEasyWay {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(100);
		for(Integer integer : numbers)
		{
			System.out.println(integer);
		}
		
		numbers.remove(numbers.size()-1);
		
		numbers.remove(0);
		for(Integer num : numbers)
		{
			System.out.println(num);
		}
	}

}
