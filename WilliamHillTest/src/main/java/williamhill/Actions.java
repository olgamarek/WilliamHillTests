package williamhill;

import org.openqa.selenium.WebDriver;

/**
 * Abstract class with actions
 * @author Olga Marek
 *
 */
public abstract class Actions {

	protected WebDriver driver = null;

	public abstract void openBrowser();

	public void openPage(String url) {
		driver.get(url);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
