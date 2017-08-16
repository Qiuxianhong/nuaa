package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	public static Calculator calculator = new Calculator();

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		// fail("Not yet implemented");
		calculator.add(2);
		calculator.add(3);
		assertEquals(5, calculator.getResult());

	}

	@Test
	public void testSubstract() {
		// fail("Not yet implemented");
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8, calculator.getResult());
	}

	@Test
	public void testMultiply() {
		// fail("Not yet implemented");
		calculator.add(10);
		calculator.multiply(2);
		assertEquals(20, calculator.getResult());
	}

	@Test
	public void testDivide() {
		// fail("Not yet implemented");
		calculator.add(8);
		calculator.divide(2);
		assertEquals(4, calculator.getResult());
	}
}
