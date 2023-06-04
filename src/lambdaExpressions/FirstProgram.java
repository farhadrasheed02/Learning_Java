package lambdaExpressions;
interface Drawable{
	void Draw();
}

public class FirstProgram {

	public static void main(String[] args) {
		
		//Without Lambda Expression 
//		Drawable d2 = new Drawable() {
//			public void Draw()
//			{
//				System.out.println("I am drawing the painting");
//			}
//		};
//		d2.Draw();
		
		
		
		//Using Lambda Expression 
		Drawable d2 = ()->{
			
			System.out.println("I am not drawing this");
			
		};
		d2.Draw();
	}

}
