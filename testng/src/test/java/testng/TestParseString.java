package testng;

import static org.testng.Assert.assertEquals;

public class TestParseString {
	
	SortAlgorithm sA = new SortAlgorithm();
	
	public void testParseOne()
	{
		String inputData="2";
		assertEquals(sA.testParsetoIntActual(inputData), sA.testParseToIntExpect(inputData));
		
	}

}
