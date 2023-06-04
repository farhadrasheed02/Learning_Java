package InterfacesImplement;

public class Employee implements ShowInfo {
	private String name;
	public void EmployeeInfo(String names)
	{
	this.name=names;
	System.out.println("My Name is "+name);
	}

	public static void main(String[] args) {
		
		
	}

	@Override
	public void ShowingInfo(String name, int i) {
		
		System.out.println("My Info from Interface "+name+" "+i);
	}
	public static void interfworking(ShowInfo formation)
	{
		formation.ShowingInfo("IBM",1800);
		
	}

}
