import org.ycpait.GeometryApp.entity;

public abstract class Shape {
	
	protected String color;
	
	public Shape(String color) {
		
		super();
		System.out.println("Inshape(String color)");
		this.color = color;
	}
	
	public abstract float calculateArea();
	
//	public abstract float calculatePerimeter();
	
	public abstract void getInfo();
	
	public void draw() {
		System.out.println("Shape drawn using color: "+ this.color);
	}
}
