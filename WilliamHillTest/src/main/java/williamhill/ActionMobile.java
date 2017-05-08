package williamhill;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Class with actions for test running on mobile device
 * @author Olga Marek
 *
 */
public class ActionMobile extends Actions {

	/**
	 * Method to open browser and initialize driver with chromedriver. Tests will be running on Google Nexus 5.
	 */
	@Override
	public void openBrowser() {

		final DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(ChromeOptions.CAPABILITY, new ChromeOptions() {
			{
				setExperimentalOption("mobileEmulation", new HashMap<String, Object>() {
					private static final long serialVersionUID = 733088480400826617L;
					{
						put("deviceName", "Google Nexus 5");
					}
				});
			}
		});
		driver = new ChromeDriver(dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
