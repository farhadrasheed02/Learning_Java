package Anonymous;
class A
{
	public void start()
	{
		System.out.println("Machine is working according to it's manual....");
	}
} 

	interface cricket
{
	public void teamind();
}
public class Test1 {
	public static void main(String[] args) {
//		a.start();
		A a = new A()
		
		{
		@Override
		public void start()	
		{
			System.out.println("Camera is working finely...");
			
			
		}
		};
		a.start();
	
	
	cricket cric = new cricket()
			{

				@Override
				public void teamind() {
					// TODO Auto-generated method stub
					System.out.println("What is going on in the team right now");
				}
			
			};
			cric.teamind();
		
	}
}

