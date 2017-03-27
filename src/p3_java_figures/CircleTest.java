package p3_java_figures;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testGetArea() {
		// given
			Circle circle = new Circle( 4 );
				
		// when
			double circleArea = circle.getArea();
			
		// then
			assertEquals( 50.26, circleArea, 0.01 );
	}

	@Test
	public void testGetPerim() {
		// given
			Circle circle = new Circle( 4 );
						
		// when
			double circlePerimeter = circle.getPerim();
			
		// then
			assertEquals( 25.132, circlePerimeter, 0.001 );
	}

	@Test
	public void testGetersSetters() {
		// given
			Circle circle = new Circle( 1 );
				
		// when
			circle.setRadius( 5 );
			
		// then
			assertEquals( 5, circle.getRadius(), 0 );
	}

}
