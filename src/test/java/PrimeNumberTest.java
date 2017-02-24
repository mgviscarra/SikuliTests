package test.java;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeNumberTest {
	@Test
	public void TestPrimeNumbers() throws FindFailed {
		Screen s = new Screen();
		s.type("src/test/java/imgs/enterNumberTxt.png","7");
		s.click("src/test/java/imgs/primeNumberRb.png");
		s.click("src/test/java/imgs/checkNumberBtn.png");
		Region region = s.exists("src/test/java/imgs/primeNumberLb.png");
		Assert.assertNotNull(region);
		s.click("src/test/java/imgs/clearBtn.png");
	}

}
