package Anonymous;

import Anonymous.Robot_InnerClassExample.Brain;

public class MainClass {

	public static void main(String[] args) {
		
		// Representation of how inner class works here..
		Robot_InnerClassExample rb = new Robot_InnerClassExample(7);
		rb.start();
		Brain br = rb.new Brain(); // if we call the inner class in main we have to refer it, by the instance of the class, whose inner class is this..
		br.think();
	}

}
