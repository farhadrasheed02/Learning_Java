package ClassandObject;

public class Main {
	static Car myCar;
	public static void main(String[] args) {
	
		
		myCar = new Car("Range Rover", "Red", 2023);	
		myCar.startEngine();
		System.out.println(myCar.toString());
		
		

	}

}
