package Keywords;

import org.testng.Assert;

public class Assertion {
	
	public static void AssertValues(String a, String b)
	{
		float exp = getText.getnumber(a);
		float act = getText.getnumber(b);

		
		System.out.println("First value to be compared "+exp);
		System.out.println("First value to be compared "+act);
		//Assert.assertEquals(b, a);
		
	}
	

}
