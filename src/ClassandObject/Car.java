package ClassandObject;

public class Car {
	String brand;
	String color;
	int year;
	public Car(String brand, String color, int year) {
		
		this.brand = brand;
		this.color = color;
		this.year = year;
	}
	
	public void startEngine()
	{
		System.out.println("Engine of the "+brand+" car"+" with " +color+" color  and manfactured in the year  "+year+" started");
		
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", year=" + year + "]";
	}
	
	
	
	

}
