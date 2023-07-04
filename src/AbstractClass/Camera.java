package AbstractClass;

public class Camera extends Machine {  /// camera(child class) extends Machine(parent class)  ==> Car is a Machine
	
	@Override
	public void Onstart() {

		System.out.println("Camera Started ....");
	}

	@Override
	public void id() {
		System.out.println("The Id of the Camera");
		
	}

}
