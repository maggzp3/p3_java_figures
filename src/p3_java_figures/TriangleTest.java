package p3_java_figures;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testGetArea() {
		// given
			Triangle triangle = new Triangle( 4, 5, 6 );
			
		// when
			double triangleArea = triangle.getArea();
			
		// then
			assertEquals( 9.921, triangleArea, 0.001 );
	}

	@Test
	public void testGetPerim() {
		// given
			Triangle triangle = new Triangle( 5, 8, 10 );
			
		// when
			double trianglePerimeter = triangle.getPerim();
			
		// then
			assertEquals( 23, trianglePerimeter, 0 );
	}
	
	@Test
	public void testGettersSetters() {
		// given
			Triangle triangle = new Triangle( 1, 1, 1 );
			
		// when
			triangle.setDim1( 2 );
			triangle.setDim2( 3 );
			triangle.setDim3( 4 );
			
		// then
			assertEquals( 2, triangle.getDim1(), 0 );
			assertEquals( 3, triangle.getDim2(), 0 );
			assertEquals( 4, triangle.getDim3(), 0 );
	}

}
