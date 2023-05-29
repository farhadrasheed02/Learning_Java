package patternsinJava;

public class PyramidStarPattern {
	public void pyramidstar(int n)
	{
		int i,j;
		for (i=0; i<n; i++)   
		{  
		//inner loop work for space      
		for (j=n-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   		

	}
	public static void main(String[] args) {
		PyramidStarPattern pyramidpattern = new PyramidStarPattern();
		pyramidpattern.pyramidstar(5);
	}

}
