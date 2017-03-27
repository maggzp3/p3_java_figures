package p3_java_figures;

public class Triangle {
	private double dim1, dim2, dim3;
	
	public Triangle( double x, double y, double z ) {
		dim1 = x;
		dim2 = y;
		dim3 = z;
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
	
	public double getDim3() {
		return dim3;
	}
	
	public void setDim3( double newDim ) {
		dim3 = newDim;
	}
	
	public double getArea() {
		double p = this.getPerim() / 2;
		return Math.sqrt( p * ( p - dim1 ) * ( p - dim2 ) * ( p - dim3 ) );
	}
	
	public double getPerim() {
		return dim1 + dim2 + dim3;
	}
}
