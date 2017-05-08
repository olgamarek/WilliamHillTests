package williamhill;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Class with actions for test running on desktop
 * @author Olga Marek
 *
 */
public class ActionDesktop extends Actions {

	/**
	 * Method to open browser and initialize driver with chromedriver
	 */
	@Override
	public void openBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
