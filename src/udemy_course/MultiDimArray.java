package udemy_course;

public class MultiDimArray {
	public static void main(String[] args) {
		int [][] myNum = {{1,2,4,6,8},
				{4,10,12,14},
		{6,3,3,1}
					};
		for(int row=0; row<myNum.length;row++)
		{
			for(int col=0;col<myNum[row].length;col++)
			{
				System.out.print(myNum[row][col]+ "\t");
			}
			System.out.println();
		}	
		}
	


}
