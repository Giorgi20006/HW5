package geo.tbc.java.main;

public class Figure {
	
	protected Figure(String x){
		System.out.println("Figure constr: " + x);
		
	}
	
	public final static void sayHello(){
		System.out.println("Hello there! ");
	}
	protected double getPerimeter() {
		return -1;
	}
	
	protected double getArea() {
		return -2;
	}
}
