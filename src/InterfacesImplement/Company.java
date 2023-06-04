package InterfacesImplement;

public class Company implements ShowInfo {
	public void comname(String name)
	{
		System.out.println("Company name is "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ShowingInfo(String name, int i) {
			System.out.println("The name of the Company is "+name+" and is established in the year "+i);
	}

}
