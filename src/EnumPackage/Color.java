package EnumPackage;

public enum Color {
 RED("Hasu"),
 GREEN("Farhad"),
 BLUE("Love"),
 WHITE("Peace");
	
	private String name;
	private Color(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public String toString()
	{
		return "This Color is called " +name;
	}
}
