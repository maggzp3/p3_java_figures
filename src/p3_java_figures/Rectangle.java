package p3_java_figures;

public class Rectangle extends Figure {
	private double dim1, dim2;
	
	public Rectangle( double x, double y ) {
		dim1 = x;
		dim2 = y;
	}
	
	public double getDim1() {
		return dim1;
	}
	
	public void setDim1( double newDim ) {
		dim1 = newDim;
	}
	
	public double getDim2() {
		return dim2;
	}
	
	public void setDim2( double newDim ) {
		dim2 = newDim;
	}
	
	public double getArea() {
		return dim1 * dim2;
	}
	
	public double getPerim() {
		return 2 * dim1 + 2 * dim2;
	}
}
