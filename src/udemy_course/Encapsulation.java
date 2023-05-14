package udemy_course;
class Security
{
	private String name;
	
	private int EmpId;

	public String getName() {
		return name;
		
		
	}
	public int getEmpId() {
		return EmpId;
	}
	

	public void setName(String Nname) {
		this.name = Nname;
		
	}
	
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		//to make sure that the sensitive data is being kept hidden so we use setters and getters.
	Security sec = new Security();
	sec.setName("Farhad"); // first we set the name of the String...
	sec.setEmpId(25155424);
	System.out.println(sec.getName());  // now we get the name of the String...
	System.out.println(sec.getEmpId());
	}

}
