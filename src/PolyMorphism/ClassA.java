package PolyMorphism;

public class ClassA {
	

	public static void main(String[] args) {
		Shapes shapes = new Shapes();
		shapes.area();
//		Shapes shap1 = shapes;
//		shap1.area();
		Triangle traingle = new Triangle();
		traingle.area();
		Circle circle = new Circle();
		circle.area();
		
	}

}
class Shapes {
	  public void area() {
	    System.out.println("The formula for area of ");
	  }
	}
class Triangle extends Shapes {
	  public void area() {
	    System.out.println("Triangle is ½ * base * height ");
	  }
	}
class Circle extends Shapes {
	  public void area() {
	    System.out.println("Circle is 3.14 * radius * radius ");
	  }
	}