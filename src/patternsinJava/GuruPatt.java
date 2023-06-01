package patternsinJava;

public class GuruPatt {

	public static void main(String[] args) {
			
		int n=4;
		int i,j;
		
		for( i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j || i==(n-1-j))
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
		
	}

}
