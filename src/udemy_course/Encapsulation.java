package udemy_course;
class Security
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String Nname) {
		this.name = Nname;
	}
	
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		//to make sure that the sensitive data is being kept hidden so we use setters and getters.
	Security sec = new Security();
	sec.setName("Farhad"); // first we set the name of the String... 
	System.out.println(sec.getName());  // now we get the name of the String...
	 
	}

}
