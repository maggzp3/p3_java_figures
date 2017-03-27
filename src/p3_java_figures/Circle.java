package p3_java_figures;

public class Circle extends Figure {
	private double radius;
	final private double pi = Math.PI;	
	
	public Circle( double x ) {
		radius = x;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius( double newRadius ) {
		radius = newRadius;
	}
	
	public double getArea() {
		return pi * ( radius * radius );
	};
	
	public double getPerim() {
		return 2 * pi * radius; 
	};
}
