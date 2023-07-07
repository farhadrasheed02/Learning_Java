package EnumPackage;

public class MainClass {

	public static void main(String[] args) {
		Color color = Color.BLUE;
		
		switch(color)
		{
		case RED :
			System.out.println("This is REd Color");
			break;
		case BLUE:
			System.out.println("Blue color from class Color");
		default:
			break;
		
		}
		
		
	}

}
