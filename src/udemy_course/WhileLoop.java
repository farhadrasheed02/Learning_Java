package udemy_course;
public class WhileLoop {
	public static void main(String[] args) {
		int myloop=0;
//		int mynum=0;
//		while(mynum<10)
//		{
//			System.out.println("Hello world"+" "+mynum);
//			mynum+=1;
//		}
		
		while(true)
		{
			System.out.println("value of the loop is  "+myloop);
			//myloop++;
			if(myloop==5)
			{
				break;
			}
			System.out.println("running");
			myloop++;
		}

	}

}
