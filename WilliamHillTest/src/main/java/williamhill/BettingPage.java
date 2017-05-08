package williamhill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Abstract page object for http://sports.williamhill.com/betting/en-gb
 * @author Olga Marek
 *
 */
public abstract class BettingPage {

	/*Driver is initialize in class Actions*/
	protected WebDriver driver;
	protected WebDriverWait wait;

	protected Locator locator;

	public BettingPage(WebDriver driver) {
		this.driver = driver;
		locator = new Locator();
		wait = new WebDriverWait(driver, 10);
	}

	public void clickOnfootballMenu() {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator.getFootballMenu()));
		driver.findElement(locator.getFootballMenu()).click();
	}

	public void waitUntilFootbalHighlights() {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator.getFootbalHighlights()));
	}

	public String getTextBetButton() {
		return driver.findElement(locator.getSelectedBetButton()).getText();
	}

	public void clickOnSelectedBetButton(int positionNumber) {
		locator.setSelectedBetButton(By.xpath("//div[" + (positionNumber + 1) + "]" + locator.getPartialPathToBet()));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator.getSelectedBetButton()));
		driver.findElement(locator.getSelectedBetButton()).click();
	}

	public void placeBet() {
		driver.findElement(locator.getPlaceBetButton()).click();
	}

	public String getOddLabel() {
		return driver.findElement(locator.getOddLabel()).getText();
	}

	public String getTextToReturnLabel() {
		return driver.findElement(locator.getToReturnLabel()).getText();
	}

	//* -- abstract methods -- */
	public abstract void putMoneyOnBetslip(String money);
}
