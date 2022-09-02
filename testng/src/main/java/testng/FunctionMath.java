package testng;

public class FunctionMath {

	public String testMathPowActual(String x)
	{
		//yg bikin error jika dimasukkan alfabet
		//System.out.println(Math.pow(2, 5));
		//skenario error
		String strOutput="";
		try {
			strOutput=String.valueOf(Math.pow(Double.parseDouble(x),Double.parseDouble(x)));
		}catch(Exception e) {
			strOutput=""+e;
		}
		//System.out.println(Math.pow(Double.parseDouble(x),Double.parseDouble(x)));
		System.out.println("test math pow actual==> "+strOutput);
		return strOutput;
	}
	
	public String testMathPowExpect(String x)
	{
		//yg bikin error jika dimasukkan alfabet
		
		String strOutput="";
		try {
			strOutput=String.valueOf(Math.pow(Double.parseDouble(x),Double.parseDouble(x)));
		}catch(Exception e) {
			strOutput=""+e;
		}
		//System.out.println(Math.pow(Double.parseDouble(x),Double.parseDouble(x)));
		System.out.println("test math pow expect==> "+strOutput);
		return strOutput;
	}
	
	
}
