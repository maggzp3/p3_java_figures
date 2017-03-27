package p3_java_figures;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testGetArea() {
		// given
			Rectangle rectangle = new Rectangle( 4, 5 );
			
		// when
			double rectangleArea = rectangle.getArea();
			
		// then
			assertEquals( 20, rectangleArea, 0);
	}

	@Test
	public void testGetPerim() {
		// given
			Rectangle rectangle = new Rectangle( 6, 7 );
			
		// when
			double rectanglePerimeter = rectangle.getPerim();
			
		// then
			assertEquals( 26, rectanglePerimeter, 0);
	}

	@Test
	public void testGettersSetters() {
		// given
			Rectangle rectangle = new Rectangle( 1, 1 );
			
		// when
			rectangle.setDim1( 3 );
			rectangle.setDim2( 5 );
			
		// then
			assertEquals( 3, rectangle.getDim1(), 0);
			assertEquals( 5, rectangle.getDim2(), 0);
	}


}
