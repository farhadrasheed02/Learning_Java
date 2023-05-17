package udemy_course;

public class keywordfinal {
	
	String str = "Farhad";
	final String wife ="Haseena";
	public static void main(String[] args) {
		
		keywordfinal kf = new keywordfinal();
		System.out.println("value before set "+kf.str);
		kf.str="Haseena";
		System.out.println("value after set "+kf.str);
		//kf.wife="xyz"; // as the wife instance is set as final so the value can not be changed once set.
		System.out.println(kf.wife);
	}

}
