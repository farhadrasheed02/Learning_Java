package Anonymous;

public class Robot_InnerClassExample {
	
	private int id;
	
	//constructor of Robot_InnerClass
	public Robot_InnerClassExample(int id)
	{
		this.id=id;
		
	}
	//creating Inner class with in robot class....
	public class Brain
	{
		public void think()
		{
			System.out.println("robot started thinking "+id);
		}
	}
	public void start()
	{
		System.out.println("Robot Started "+id);
		//call here the inner class...
		Brain br = new Brain();
		br.think();
	}
}
