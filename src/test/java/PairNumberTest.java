package test.java;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PairNumberTest {

	@Test
	public void TestPairNumbers() throws FindFailed {
		Screen s = new Screen();
		s.type("src/test/java/imgs/enterNumberTxt.png","256");
		s.click("src/test/java/imgs/pairNumberRb.png");
		s.click("src/test/java/imgs/checkNumberBtn.png");
		Region region = s.exists("src/test/java/imgs/pairNumberLb.png");
		Assert.assertNotNull(region);
		s.click("src/test/java/imgs/clearBtn.png");
	}

}
