package inheritance;

public interface Drawable {
	public void Draw();
	public void Sketch();
}
class Rectangle implements Drawable{ 
	
public void Draw(){System.out.println("drawing rectangle");
}
public void Sketch()
{
	System.out.println("I am doing this sketching");
}
  
}
 
