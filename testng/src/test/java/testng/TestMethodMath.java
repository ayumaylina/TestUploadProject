package testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestMethodMath {
	//panggil class yg mau dites
	FunctionMath fM = new FunctionMath();

	@Test
	public void testMathPow() {
		String strPow ="2";
		//kalo di input 2A akan passes, krn dua duanya akan error
		//kecuali di salah satu method strOutput tidak diisi, maka hasilnya satu kosong, akan failures
		assertEquals(fM.testMathPowActual(strPow),fM.testMathPowExpect(strPow));
	}
}
