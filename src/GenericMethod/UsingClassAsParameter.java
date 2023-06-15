package GenericMethod;

import java.util.ArrayList;

public class UsingClassAsParameter {
	
	
	public static void main(String args[])
	{
		ArrayList<String> str = new ArrayList<>();
		str.add("Farhad");
		str.add("Haseena");
		showlist(str);
		
		
		
	}
	public static void showlist(ArrayList<String> str)
	{
		for(String value : str)
		{
			System.out.println(value);
		}
		
	}

}
class Machine extends Camera
{

	Camera machine = new Camera();
	Machine mc = new Machine();
	mc.
	
	
}
class Camera
{
	
	public void seecam()
	{
		System.out.println("I can see cam ...");
	}
	
	
}