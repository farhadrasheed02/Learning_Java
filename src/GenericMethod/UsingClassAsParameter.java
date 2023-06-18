package GenericMethod;

import java.util.ArrayList;

public class UsingClassAsParameter 
{	
	public static void main(String args[])
	{
		ArrayList<Machine> str = new ArrayList<>();
		ArrayList<Camera> cam = new ArrayList<>();
		str.add(new Machine());
		cam.add(new Camera());
		showlist(str);
		showlist(cam);		
	}

	// showing in this method that class can be directly send as argument...
	public static void showlist(ArrayList<?> str)
	{
		for(Object value : str)
		{
			System.out.println(value);
		}
		
	}

}
class Camera extends Machine
{

	@Override
	public String toString() {
		return "Camera is Working....";
	}	
}
class Machine
{

	@Override
	public String toString() {
		return "Machine is running ";
	}
	

}
