package lambdaExpressions;
interface Drawable{
	void Draw();
}

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstProgram fp = new FirstProgram();
		
		Drawable d2 = ()->{
			
			System.out.println("I am not drawing this");
			
		};
		d2.Draw();
	}

}
