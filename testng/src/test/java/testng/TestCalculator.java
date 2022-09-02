package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestCalculator {
	
	@Test
	public void testAddNilai() {
		Calculator c = new Calculator();
		assertEquals(c.addNilai(5, 10), 15);
	}
	
	@Test
	public void testDivideNilai() {
		Calculator c = new Calculator();
		assertEquals(c.divideNilai(10, 3), 3.333);
	
	}
	
	@BeforeMethod 
	
	

}
