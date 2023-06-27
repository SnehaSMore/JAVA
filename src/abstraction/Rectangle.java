package abstraction;

public class Rectangle extends Shape
{
 
	@Override
	public void getArea() {
		int w=6,l=8;
		double areaRec=(w*l);
		System.out.println("Area of Rectangle Is: " +areaRec);
	}

	@Override
	public void getPerimeter() {
		
		int l=6,w=4;
		double p= (2*(l+w));
		System.out.println("Perimeter of Rectangle Is" +p);
		
	}

	/*@Override
	public void draw() {
		System.out.println("I can draw rectangle");
	}*/
	
	
	

}
