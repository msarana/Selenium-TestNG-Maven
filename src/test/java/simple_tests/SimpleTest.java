package simple_tests;
/**
 *   File Name: SimpleTest.java<br>
 *
 *   Sarana, Maria<br>
 *
 *   Created: Feb 22, 2016
 *
 */

/**
 * SimpleTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author      Sarana, Maria
 * @version     1.0.0
 * @since       1.0
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

	private WebDriver driver;

	@Test
	public void checkEqual() {
		Assert.assertEquals(3, 1 + 2);
	}

	@Test(enabled = false)
	public void testGoogleChrome() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.get("http://www.google.com");
		this.driver.quit();

	}

	@Test
	public void testGoogleFF() {
		this.driver = new FirefoxDriver();
		this.driver.get("http://www.google.com");
		this.driver.quit();
	}

	@Test
	public void testSafari() {
		this.driver = new SafariDriver();
		this.driver.get("http://google.com");
		this.driver.quit();
	}

}
