package inheritance;

public class InterfaceImplement implements Drawable, Artist {

	public void Draw()
	{
		System.out.println("Drawing pictures");
	}
	@Override
	public void Sketch() {}
	@Override
	public void Art() {
		System.out.println("I am an Artist");
	}
	public static void main(String[] args) {
	InterfaceImplement inter = new 	InterfaceImplement();
	inter.Draw();
	inter.Sketch();
	inter.Art();
	}
	

	

}
