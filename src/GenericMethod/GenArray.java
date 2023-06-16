package GenericMethod;

public class GenArray {

	// Generic Method 
	public static <E> void GenMethod(E[] arr)
	{
		for( E element: arr)
		{
			System.out.println(element);
		}

	}
	public static void main(String args[])
	{
		 Integer[] intArray = { 1, 2, 3, 4, 5 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	      
	      GenMethod(intArray);
	      GenMethod(doubleArray);
	      GenMethod(charArray);
	}
}
