package geo.tbc.java.main;

public class Rectangle extends Figure{
	private static final double maxHeight;
	private static final double maxWidth;
	double height, width;
	static double maxNum;
	static Rectangle maxObj;
	
	static {
		maxHeight = 10;
		maxWidth = 20;
	}
	
	public Rectangle() {
		this(3,4);
	}
	public Rectangle(double height, double width) {
		super("Some TXT");
		if (height <= maxHeight) {
			this.height = height;
		}
		else {
			this.height = maxHeight;
		}
		if (width <= maxWidth) {
			this.width = width;
		}
		else {
			this.width = maxWidth;
		}
	}
	//Overload
	double getPerimeter(double height, double width) {
		return (height + width)*2;
	}
	//Overload
	double getArea(double height, double width) {
		return height * width;
	}
	
	@Override
	protected double getPerimeter() {
		double perimeter = (height+width)*2;
		//calling parent class method from within the child class method
		//System.out.println("Parent class value: " + super.getArea());
		return perimeter;
		
	}
	
	@Override
	protected double getArea() {
		double area = height*width;
		//calling parent class method from within the child class method
		//System.out.println("Parent class value: " + super.getArea());
		return area;
	}
	
	public static Rectangle getMax(Rectangle [] rectObjs){
		double[ ] areasOfobjs = new double[3];
		
		for (int i = 0; i < rectObjs.length; i ++ ) {
			areasOfobjs[i] = rectObjs[i].getArea();
		}
		
		for (int j = 0; j < areasOfobjs.length; j++) {
			if (j != 0 && areasOfobjs[j] > areasOfobjs[j - 1]) {
				maxNum = areasOfobjs[j];
				maxObj = rectObjs[j];
			}
			else {
				maxNum = areasOfobjs[0];
				maxObj = rectObjs[0];
			}
		}
		
		return maxObj;
	}
	public String getDimensions() {
		String output = "Height: "+height + " Width: " + width;
		return output;
	}
}
