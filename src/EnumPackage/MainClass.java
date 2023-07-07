package EnumPackage;

public class MainClass {
	static Color color;
	public static void main(String[] args) {
		
		 color= Color.BLUE;
		
			
		switch(color)
		{
		case BLUE:
			System.out.println("This is the blue color from Color Class");
			break;
		case GREEN:
			System.out.println("This is the "+ color+" from Color Class");
			break;
		case RED:
			System.out.println("This is the "+ color+" from Color Class");
			break;
		case WHITE:
			System.out.println("This is the "+ color+" from Color Class");
			break;
		default:
			break;

		
	}
		System.out.println(Color.RED);
		System.out.println(Color.BLUE.getName());
		System.out.println(Color.GREEN.toString());
		System.out.println("Enum name as a String "+Color.RED.name());
		//System.out.println(Color.RED.getClass());
		//System.out.println(Color.GREEN instanceof Color);  // is it actually instance of anything..it should print true...
		
	}
	
}
