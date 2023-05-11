package udemy_course;
public class ForLoop {
	public static void main(String[] args) {
		for(int i=0;i<10;i=i+=1)   // i++, i=i+1; i+=1; all three are same
		{
			//System.out.println("Hello World"+" "+i);
			System.out.printf("The value of i is : %d \n",i); // printf(is used for formating )
			
			for (int j=i;j<5;j++)
			{
				System.out.println("the value of the inner for is "+j);
			}
		}
	}

}
