package abstraction;

public class Circle extends Shape
{
	/*	@Override
	public void draw() {
		
		System.out.println("i can draw circle");
		
	}*/
	
	
	@Override
	public void getArea() {
		int r=12;
		double area=3.14*r*r;
		System.out.println("Area of Circle Is :"+area);
		
	}

	@Override
	public void getPerimeter() {
		int d=8;
		double peri=(3.14*d);
		System.out.println("Perimeter of Circle Is:" +peri);
		
	}



	
	
}
