package patternsinJava;
public class Pyramid {
	public static void pyramidPattern(int n) 
	{  
		int i,j;
		for(i=0; i<n; i++)  // prints the row...
		{   
			for(j=0; j<=i; j++)
			{
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();
		}
	} 
	public static void main(String[] args) {

		Pyramid pyramid = new Pyramid();
		pyramid.pyramidPattern(5);


	}

}
