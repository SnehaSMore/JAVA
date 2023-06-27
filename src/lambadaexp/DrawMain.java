/*package lambadaexp;

public class DrawMain implements Drawable
{

	@Override
	public void draw() {
		System.out.println("hai");
		
	}
	public static void main(String[] args) {
		DrawMain d=new DrawMain();
		d.draw();
	}

	
	
}*/

package lambadaexp;

public class DrawMain 
{
public static void main(String[] args) {
		Drawable d=() ->
		{
			System.out.println("hai");
		};
		d.draw();
	}

}