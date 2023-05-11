package udemy_course;

public class MultiDimArray {
	public static void main(String[] args) {
		int [][] myNum = {{1,2,4,6,8},{4,10,12,14,59}};
		//System.out.println(myNum[1][3]);
		for(int i=0; i<myNum.length;i++)
		{
			for(int j=0;j<myNum[i].length;j++)
			{
				System.out.println(myNum[i][j]);
			}
			//System.out.println(myNum[i]);
		}
		
		}
	


}
