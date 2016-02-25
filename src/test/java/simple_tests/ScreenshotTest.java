package simple_tests;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *   File Name: ScreenshotTest.java<br>
 *
 *   Sarana, Maria<br>
 *
 *   Created: Feb 25, 2016
 *
 */

/**
 * ScreenshotTest //ADDD (description of class)
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
public class ScreenshotTest {

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
	public void testNavigation() throws InterruptedException {
		this.driver.navigate().to("http://www.amazon.com");
		Thread.sleep(1000);
	}

	private String getTimestamp() {
		String pattern = "MMddyyyyhhmmss";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date date = new Date();
		return format.format(date);
	}

	@Test
	private void takeScreenshot() throws IOException {
		// WebDriver augmentedDriver = new Augmenter().augment(this.driver);
		File screenshot = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);
		String fileName = this.getTimestamp() + ".png";
		FileUtils.copyFile(screenshot, new File(fileName));

	}

}
