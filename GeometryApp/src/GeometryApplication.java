import org.ycpait.geometryapp;
public class GeometryApplication {

	public static void main(String[] args) {
		
		
		Shape s; //= new Circle(5, "red");
		s = new Circle(4, "Black");
		
		//Invoking generalized method.
		s.calculateArea();
		s.draw();
		
		//Invoking specialized methods
		Circle c = (Circle)s;  //DownCasting
		c.getPi();
		
		System.out.println("Area of Circle is: "+ s.calculateArea());
		s.draw();
		
		Circle c2 = new Circle(2, "Red");
		s=c; //UpCasting
		System.out.println("Area of Circle is: "+ s.calculateArea());
		s.draw();
		
		Circle c1 = (Circle)s;   //DownCasting
		c1.getPi();     //Invoking Circle specific method
//		
//		System.out.println();
//		
//		Rectangle r = new Rectangle(10, 20, "Blue");
//		System.out.println("Area of Rectangle: "+ r.calculateAreaOfRect());
//		r.draw();
	}
}
	