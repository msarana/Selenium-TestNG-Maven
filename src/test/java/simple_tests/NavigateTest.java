package simple_tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *   File Name: NavigateTest.java<br>
 *
 *   Sarana, Maria<br>
 *
 *   Created: Feb 25, 2016
 *
 */

/**
 * NavigateTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Sarana, Maria
 * @version 1.0.0
 * @since 1.0
 *
 */
public class NavigateTest {

	private WebDriver driver;

	@BeforeClass
	public void setup() {
		this.driver = new FirefoxDriver();
	}

	@AfterClass
	public void tearDown() {
		this.driver.quit();
	}

	@Test
	public void testNavigation() {
		this.driver.navigate().to("http://www.amazon.com");
	}

}
