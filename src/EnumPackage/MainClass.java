package EnumPackage;

public class MainClass {
	static Color color;
	public static void main(String[] args) {
		
		color= Color.BLUE;
		color=Color.RED;
		
		
		
		switch(color)
		{
		case BLUE:
			System.out.println("This is the "+ color+" from Color Class");
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
		
		
	}

}
