package geo.tbc.java.main;
import geo.tbc.java.secondary.Square;

public class Main {

	public static void main(String[] args) {
		//Rectangle rect1 = new Rectangle(10,12);
		//System.out.println(rect1.getPerimeter());
		//System.out.println(rect1.getPerimeter(6,10));
		//System.out.println(rect1.getArea());
		//System.out.println(rect1.getArea(6,10));
		
		//Calling parent class method with a parent class object
		//Figure fig1 = new Figure("Smth");
		//System.out.println(fig1.getPerimeter());
		//System.out.println(fig1.getArea());
		
		//System.out.println(rect1 instanceof Rectangle);
		//System.out.println(rect1 instanceof Figure);
		//System.out.println(rect1 instanceof Object);
		// true,true,true
		
		//Rectangle rect2 = new Rectangle();		
		//System.out.println(rect2.getPerimeter());
		
		//System.out.println(rect2 instanceof Rectangle);
		//System.out.println(rect2 instanceof Figure);
		//System.out.println(rect2 instanceof Object);
		//false,true,true
		
		Square square1 = new Square();
		System.out.println(square1.getArea());
		
	}

}
