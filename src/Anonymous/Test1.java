package Anonymous;
class A
{
	public void start()
	{
		System.out.println("Machine is working according to it's manual....");
	}
}
public class Test1 {
	public static void main(String[] args) {
		A a = new A()
		{
		@Override
		public void start()	
		{
			System.out.println("Camera is working finely...");
			
			
		}
		};
		a.start();
	}
	
		
	}


