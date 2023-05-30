package udemy_course;

public class SetterGetter {
	private String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		SetterGetter sg = new SetterGetter();
		sg.setName("Farahd");
		System.out.println(sg.getName());

	}

}
