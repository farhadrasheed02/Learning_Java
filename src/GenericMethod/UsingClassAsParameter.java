package GenericMethod;

import java.util.ArrayList;

public class UsingClassAsParameter {
	
	
	public static void main(String args[])
	{
		ArrayList<Machine> str = new ArrayList<>();
		//ArrayList<Camera> cam = new ArrayList<>();
		str.add(new Machine());
		//cam.add(new Camera());
		//System.out.println(str);
//		str.add("Farhad");
//		str.add("Haseena");
		showlist(str);
		
		
		
	}

	// showing in this method that class can be directly send as argument...
	public static void showlist(ArrayList<Machine> str)
	{
		for(Machine value : str)
		{
			System.out.println(value);
		}
		
	}

}
class Camera extends Machine
{

	public void getCam()
	{
		System.out.println("I have DSLR Camera....");
	}
	
	
}
class Machine
{
	
	


	public void machinrun() {
		
		System.out.println("Machine is working ...");
	}
	
	public String get()
	{
		return "Machine is running";
	}
}
